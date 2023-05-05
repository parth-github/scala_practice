/**
 * Default arg
 * Named arg
 * Variable arg
 */
object ArgsDemo extends App {
  def add(num: Int, incrementBy: Int) = {
    num + incrementBy
  }
  println(add(5,1))

  //Default arg: value given at param
  def addV2(num: Int, incrementBy: Int = 1) = {
    num + incrementBy
  }
  println(addV2(5))

  //Named arg:
  def addV3(num: Int = 8, incrementBy: Int = 1) = {
    num + incrementBy
  }
  println(addV3(incrementBy = 5))

  //Variable length arg
  def printFn(name: String*): Unit = {
    for (n <- name) {
      print(n + " ")
    }
  }
  printFn("hello", "hi", "how", "are", "you")
}
