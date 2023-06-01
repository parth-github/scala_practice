import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

/**
 * Improvement: How many times movies were rated 5 star
 * Input Dataset: user_id, movie_id, rating_given, timestamp
 * After map Intermediate dataset: Customer_id, Amount
 * Reduce by key
 * SortBy
 */
object MovieRating extends App {
  Logger.getLogger("org").setLevel(Level.ERROR)

  val sc = new SparkContext("local[*]", "MovieRating")

  val rdd1 = sc.textFile("file:///E:\\spark-scala-project\\scala_practice\\inputpath\\moviedata.csv")
  //rdd1.collect.foreach(println)

  val mappedInput = rdd1.map(x => (x.split("\t")(1),x.split(",")(2).toFloat))
  //rdd2.collect.foreach(println)

  //val rdd3 = rdd2.map(x => (x,1))

  val totalByCustomer = mappedInput.reduceByKey(_+_)

  //totalByCustomer.collect.foreach(println)
  val sortedTotal = totalByCustomer.sortBy(_._2, ascending = false)
  sortedTotal.collect.foreach(println)


  // rdd4.saveAsTextFile("file:///E:\\spark-scala-project\\scala_practice\\outputpath\\customerorders_output")


  scala.io.StdIn.readLine()
}
