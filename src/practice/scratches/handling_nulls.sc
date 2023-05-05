/**
 * Nil - an empty List
 * Null is a trait and there is only one instance called null
 *
 * None
 * Nothing - there was an error and nothing is returned
 * Option - returns Some or None
 * Unit
 */

def tryNull(thing: Null): Unit = println("that worked")
tryNull(null)

// usage of null should be restricted to avoid NullPointerException

// Nil is an empty List
val c = Nil
println(c)

//Nothing
def func = throw new Exception
//func


//Option
//if there is no useful value to return from a function and returning null is not meaningful
def getAStringMayBe(num: Int) : Option[String] =
  if (num >= 0) Some("A positive number!")
  else None

def printResult(num: Int): Unit = {
  getAStringMayBe(num) match {
    case Some(str) => print(str)
    case None => println("No String!")
  }
}
printResult(10)
printResult(-10)

//Unit - void type when there is side effects
//
def funcUnit = println("Hello")



