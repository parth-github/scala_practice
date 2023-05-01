/**
 * Case Class
 * A special kind of classes where you need to write less code.
 * 1. class params are automatically promoted as class field
 * 2. toString, hashCode, equals are already implemented
 * 3. Companion object already created
 * 4. have a handy copy method
 * 5. Serializable: can be tranferred over network
 */

//case class
case class Person(name: String, age:Int)

val p = Person("Harris", 25)
p.age //class params can be called without var/val declaration
p.name //class params are automatically promoted to field

// case classes are sensible toString
p.toString // no class cryptic value
p //Syntactic sugar of toString

//equals and hashCode methods are implemented already
p.hashCode

//equals method
val p1 = Person("Andrew", 23)
p.equals(p1)

//Companion object created automatically
val p0 = Person
p0.apply("Mike", 27)
p0.toString


//copy()
val p3 = p1.copy()
p3.equals(p1)

p0.eq(p)
p0.eq(p1)











