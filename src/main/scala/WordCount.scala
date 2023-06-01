import org.apache.spark.SparkContext

object WordCount extends App {
  val sc = new SparkContext("local[*]", "wordcount")

  val rdd1 = sc.textFile("file:///E:\\spark-scala-project\\scala_practice\\inputpath\\wordcount_input")

  val rdd2 = rdd1.flatMap(_.split(" "))

  val rdd3 = rdd2.map(x => (x,1))

  val rdd4 = rdd3.reduceByKey(_+_)

  //rdd4.collect.foreach(println)

  rdd4.saveAsTextFile("file:///E:\\spark-scala-project\\scala_practice\\outputpath\\wordcount_output")


  scala.io.StdIn.readLine()
}
