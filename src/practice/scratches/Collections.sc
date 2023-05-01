//Array
//List
//Tuple
//Range
//Set
//Map
//Vector
//IndexedSeq

// Array
val arrA: Array[Int] = Array(1, 2, 3, 4, 5)
println(arrA)
println(arrA.mkString("||"))

for (i <- arrA) println(i)

// Array mutability
arrA(2) = 7
println(arrA.mkString("$"))

// Searching with index is fast
print(arrA(3))

// arrA = Array(1, 4, 5) reassignment to a val error

//////////
// List

val xList: List[Int] = List(1,2,3,4)

for (x <- xList) println(s"$x")
println(xList.mkString(","))

xList.head
xList.tail
xList.sum
10::xList.reverse
10::xList
xList(3)

//Tuple
// 1 based index
// can hold different types
// used for db records
// 2 elements are called key, value pair

val tuple1 : (String, Int) = ("Smriti", 25)
tuple1._2
tuple1._1

val keyVal = 107 -> "One Hundred and Seven"
keyVal._2

keyVal.swap

// Set
val setA = Set(1,2,3,1,2,3,4)
setA.tail
setA.min
setA.max
setA.sum

//Map
val mapA = Map(1 -> "Smriti", 2 -> "Snigdha", 3 -> "Pal")
mapA.get(3)
