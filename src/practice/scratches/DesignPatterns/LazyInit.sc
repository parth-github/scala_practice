/*
* lazy Initialization:
* Initializes a value not before it is accessed.
* It defers the initialzation till it is called.
 */

//Not lazy
val x = {
  println("computing x")
  42
}

//Lazy
lazy val y: Int = {
  println("computing y")
  42
}

y