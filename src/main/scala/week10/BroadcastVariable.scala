package week10

import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

import java.io.File
import scala.io.Source
import scala.io.Source

/*
* Broadcast variable: a value to executors in Spark
* A file of "boringwords" is created given to every executors as broadcast variable
 */
object BroadcastVariable extends App {
  def loadBoardingWords(): Set[String] = {
    var boringWords:Set[String] = Set()
    val linesSource = Source.fromFile(new File("E:\\spark-scala-project\\scala_practice\\inputpath\\boringwords.txt"))
    val lines = linesSource.getLines()
    for (line <- lines) {
      boringWords += line
    }

    linesSource.close()
    boringWords
  }

  //For the sake of completeness

//  val testTxtSource = scala.io.Source.fromFile("test.txt")
//  val str = testTxtSource.mkString()
//  testTxtSource.close()

  Logger.getLogger("org").setLevel(Level.ERROR)

  val sc = new SparkContext("local[*]", "lesson2_bigdata_capmpaign")

  val nameSet = sc.broadcast(loadBoardingWords)

  val rdd1 = sc.textFile("file:///E:\\spark-scala-project\\scala_practice\\inputpath\\bigdatacampaigndata.csv")
  val rdd2 = rdd1.map(x => (x.split(",")(10).toFloat, x.split(",")(0)))
  val rdd3 = rdd2.flatMapValues(x => x.split(" "))
  val rdd4 = rdd3.map(x => (x._2.toLowerCase(), x._1))
  val rdd5 = rdd4.filter(x => !nameSet.value(x._1))
  val rdd6 = rdd5.reduceByKey(_ + _)
  val rdd7 = rdd6.sortBy(x => x._2, ascending = false)
  rdd7.take(20).foreach(println)

  scala.io.StdIn.readLine()
}
