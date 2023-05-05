/**
 * Ex 3:
 * E&Y - Big Data Interview Scala Coding Round.Given a sentence of words we need to reverse it with 3 variations.Input:hello how are youOutput:uoy era woh olleh (reverse the sentence literally)olleh woh era uoy (reverse each word in the sentence)you are how hello (reverse the order of words in sentence)
 */

var x = "hello how are you"

val y: Array[String] = x.split(" ")
var output2: String = ""
for (word <- y) {
  output2 = output2 + word.reverse + " "
}
println(x.reverse)
println(output2)
println(x)






