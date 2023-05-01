/** Inheritance
 * Access Modifier - private, protected, public (default)
 * Abstract Class
 * Trait
 */

class Animal {
  def eat = println("Animal eat a lot")

}

class Cat extends Animal {
  def preferredMeal = println("Milk")
}

val cat = new Cat
cat.eat //refer method of parent class
cat.preferredMeal


/**
 * private method in parent class can not be called from anywhere
 * protected method in parent class can be called from child class only; it can't be called from outside any class
 * default is public
 */

