/**
 * Vector is kind of mix of Array and a List
 * Array for indexed based searching
 * List for immutability
 * IndexedSeq[T]
 */

// This for loop can't be assigned to a variable
for (i <- 1 to 10) {
  i*i // unused expression without side effects
}
/**
 * yield to get value from for loop
 */
// To get the value from for loop use yield which gives value as type Vector
val a =  for (i <- 1 to 10) yield {
  i*i
}
println(a)

/**
 * if guard
 */

val b =  for (i <- 1 to 10) yield {
  if (i%2==0) i*i
}
println(b)
// To avoid getting null values from above if block use if guard
val c =  for (i <- 1 to 10; if i%2==0) yield {
  i*i
}
println(c)

//Or
val d = for {
  i <- 1 to 10
  if i%2 == 0
} yield i*i
print(d)


/**
 * Pattern guard:
 * case statement can be combined with if expressions to provide extra logic during pattern matching
 */
def checkSign(x: Int): String = {
  x match {
    case a if a < 0 => s"$a is a negative number"
    case b if b > 0 => s"$b is a positive number"
    case c => s"$c neither +ve nor -ve"
  }
}
println(checkSign(10))

def f(x: Option[Int]) = x match {
  case Some(i) if i%2 == 0 => println(i)
  case None => println("none")
  case _ => println("Something else")
}

/**
 * for comprehension
 */
for (i <- 1 to 10)  println(i*i)
(1 to 10).foreach(i => println(i*i))

for (i <- 1 to 10)  yield i*i

(1 to 10).map(i => i*i)

for (i <- 1 to 10; j <- 'a' to 'c') yield i*2 + " " + j

