package week10

import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

object lesson1_bigdata_capmpaign extends App {
  Logger.getLogger("org").setLevel(Level.ERROR)

  val sc = new SparkContext("local[*]", "lesson1_bigdata_capmpaign")

  // Get a RDD (dataset) out of the data file
  val rdd1 = sc.textFile("file:///E:\\spark-scala-project\\scala_practice\\inputpath\\bigdatacampaigndata.csv")
  val rdd2 = rdd1.map(x => (x.split(",")(10).toFloat, x.split(",")(0)))
  val rdd3 = rdd2.flatMapValues(x => x.split(" "))
  val rdd4 = rdd3.map(x => (x._2.toLowerCase(), x._1))
  val rdd5 = rdd4.reduceByKey(_+_)
  val rdd6 = rdd4.sortBy(x => x._2, false)
  rdd6.take(20).foreach(println)

  scala.io.StdIn.readLine()
}
