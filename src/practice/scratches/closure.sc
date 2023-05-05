/**
 * Closure:
 * In FP a func can return a func
 * In OOP have to return a object
 * Closure function can only be an anonymous function but not named function
* Associates a state with a function
 */

//OOP
class Person {
  // data element
  // functionality
}
new Person()

//a function returning an anonymous function
def areaOfCircle = {
  val pi=3.14; //associate a state with functionality
  (x:Int) => pi*x*x
}

areaOfCircle(20)

val area = areaOfCircle
area(20)
