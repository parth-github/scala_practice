import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

/**
 * Improvement: Sorted the data and get the top 10
 * Input Dataset: Customer_id, Product_id, Amount
 * After map Intermediate dataset: Customer_id, Amount
 * Reduce by key
 * SortBy
 */
object MapReduceSort extends App {
  Logger.getLogger("org").setLevel(Level.ERROR)

  val sc = new SparkContext("local[*]", "mapReduceSort")

  val rdd1 = sc.textFile("file:///E:\\spark-scala-project\\scala_practice\\inputpath\\customerorders.csv")
  //rdd1.collect.foreach(println)

  val mappedInput = rdd1.map(x => (x.split(",")(0),x.split(",")(2).toFloat))
  //rdd2.collect.foreach(println)

  //val rdd3 = rdd2.map(x => (x,1))

  val totalByCustomer = mappedInput.reduceByKey(_+_)

  //totalByCustomer.collect.foreach(println)
  val sortedTotal = totalByCustomer.sortBy(_._2, ascending = false)
  sortedTotal.collect.foreach(println)


  // rdd4.saveAsTextFile("file:///E:\\spark-scala-project\\scala_practice\\outputpath\\customerorders_output")


  scala.io.StdIn.readLine()
}
