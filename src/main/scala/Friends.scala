
import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

/**
 * Improvement: find average number of connections for each age
 * Input Dataset: row_id, name, age, number_of_connections
 * After map Intermediate dataset: Customer_id, Amount
 * Reduce by key
 * SortBy
 */
object Friends extends App {
  Logger.getLogger("org").setLevel(Level.ERROR)

  val sc = new SparkContext("local[*]", "MovieRatingCount")

  // Get a RDD (dataset) out of the data file
  val rdd1 = sc.textFile("file:///E:\\spark-scala-project\\scala_practice\\inputpath\\friendsdata.csv")
  //rdd1.collect.foreach(println)
def parseLine(line: String) = {
  val fields = line.split("::")
  val age = fields(2).toInt
  val numFriends = fields(3).toInt
  (age, numFriends)
}

  val mappedInput = rdd1.map(parseLine)
  mappedInput.foreach(println)

  val mappedConnection = mappedInput.map(x => (x._1, (x._2,1)))
  mappedConnection.foreach(println)

  val finalRDD = mappedConnection.reduceByKey((x,y) => (x._1+y._1, x._2 + y._2))
  finalRDD.foreach(println)

  val outputRDD = finalRDD.map(x => (x._1, x._2._1/x._2._2))
  outputRDD.sortBy(_._1).foreach(println)
  // take each row, split it with \t, and get the 3rd column as movie rating
  //create a RDD with movie rating column
//  val mappedCountByAge = rdd1.map(x => (x.split("::"))(2)).countByValue
//  mappedCountByAge.foreach(println)
//
//  val mappedSumByAge = rdd1.map((x => (x.split("::"))(3)))

  /**
   * Equivalent code for next two lines
   * val totalByRatings = mappedRatings.countByValue
   */

  //OR
  // map each row with count value 1
  //val mappedRatings = mappedInput.map(x => (x,1))


  // take each row of mappedRatings RDD, add group by key and add each row value with total
  //val totalByRatings = mappedRatings.reduceByKey(_+_)
  //val totalByRatings = mappedInput.countByValue()
  //totalByRatings.foreach(println)

  //above RDD gives output by descending key of movie ratings
  //sort it with ascending key
  //val sortedRating = totalByRatings.sortBy(_._1, ascending = false)
  //sortedRating.collect.foreach(println)


  // rdd4.saveAsTextFile("file:///E:\\spark-scala-project\\scala_practice\\outputpath\\customerorders_output")


  scala.io.StdIn.readLine()
}
