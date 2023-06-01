
import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

/**
 * Improvement: How many times movies were rated 5 star
 * Input Dataset: user_id, movie_id, rating_given, timestamp
 * After map Intermediate dataset: Customer_id, Amount
 * Reduce by key
 * SortBy
 */
object MoviesRatingCount extends App {
  Logger.getLogger("org").setLevel(Level.ERROR)

  val sc = new SparkContext("local[*]", "MovieRatingCount")

  // Get a RDD (dataset) out of the data file
  val rdd1 = sc.textFile("file:///E:\\spark-scala-project\\scala_practice\\inputpath\\moviedata.csv")
  //rdd1.collect.foreach(println)

  // take each row, split it with \t, and get the 3rd column as movie rating
  //create a RDD with movie rating column
  val mappedInput = rdd1.map(x => x.split("\t")(2))
  //rdd2.collect.foreach(println)

  // map each row with count value 1
  val mappedRatings = mappedInput.map(x => (x,1))

  // take each row of mappedRatings RDD, add group by key and add each row value with total
  val totalByRatings = mappedRatings.reduceByKey(_+_)

  totalByRatings.foreach(println)

  //above RDD gives output by descending key of movie ratings
  //sort it with ascending key
  val sortedRating = totalByRatings.sortBy(_._2, ascending = true)
  sortedRating.collect.foreach(println)


  // rdd4.saveAsTextFile("file:///E:\\spark-scala-project\\scala_practice\\outputpath\\customerorders_output")


  scala.io.StdIn.readLine()
}
