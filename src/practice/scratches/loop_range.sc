// Range
val x = 1 to 10
var aLongRange = 1L to 1000000000000000000L

// for with range
for (y <- x) println(y)

for (y <- 1 to 10) {
  println(y)
}

// expression in for loop

for (z <- 1 to 10) {
  val squared = z*z
  println(s"$z: $squared, ")
}

// while loop
var a = 1.0f
while (a <= 1.1) {
  print(f"$a%.7f\n")
  a += 0.01f
}

print(a)


// do while

var b = 0
do {
  println(b)
  b += 1
}while (b < 3)
println(b)





