/**
 * Abstract class and interface
 * can contain unimplemented methods and undefined values
 * purpose is to implement it in child class
 * instantiation is not possible
 */

abstract class Animal {
  //undefined fields
  val creatureType: String
  //unimplemented method
  def eat: Unit
  //implemented method
  def sleep = println("Animal sleep for fixed time")
}

//Can't be instantiated
//Error: new Animal

class Dog extends Animal {
  val creatureType: String = "Canine"
  def eat: Unit = println("Eats meat")
}

val dog = new Dog
dog.sleep

//Multiple inheritance not possible
//Child class cant inherit multi parent classes
//traits donot have constructor
trait Carnivore {
  //can contain implemented and unimplemented methods
  def preferredMeal
}

trait ColdBlooded

class Crocodile extends Animal with Carnivore with ColdBlooded {
  val creatureType: String = "Canine"
  def eat = println("Eat Goat")

  override def preferredMeal: Unit = println("Like sea food")
}

val croc = new Crocodile
croc.creatureType
croc.eat
croc.preferredMeal

