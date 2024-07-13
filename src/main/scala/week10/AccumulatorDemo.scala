package week10

import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

import scala.io.Source

/*
* Accumulators: there is a shared copy kept in your driver machine.
*  each of the executors will update it
* however none of the executors can read the value of accumulator, they can only change the value.
* this is same as counters in mapreduce
*
* 2 kind of shared variable
* 1. accumulator (single copy on driver machine): similar to counters in Mapred
* 2. broadcast variable (separate copy on each machine): similar to map side join
*
 */
object AccumulatorDemo extends App {

  Logger.getLogger("org").setLevel(Level.ERROR)

  val sc = new SparkContext("local[*]", "lesson3_bigdata_capmpaign")

  val data_rdd = sc.textFile("file:///E:\\spark-scala-project\\scala_practice\\inputpath\\bigdatacampaigndata.csv")
  val accum_rdd = sc.longAccumulator("blank lines accumulator")
  data_rdd.foreach(x => if (x!="") accum_rdd.add(1))
  println(accum_rdd.value)

  scala.io.StdIn.readLine()
}
