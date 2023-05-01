//create a class and instance of class
class Person {
  val a = null //class field
  val b = null

  def func(): Unit = {}
}

val p = new Person
p.a
p.func


// creating class with constructor
class Student(name: String, age: Int)
val s = new Student("Smriti",40)
//s.name //Error- name to promoted as class field by declaring as val or var

/** To make class level functionality for sal_index
 * require to declare static variable
 */
// Object is a singleton class with same name as reference
//Companion Object
object Employee {
  val x = 1.1
  def indexer = x  * .003
}
//Companion class
class Employee(id: Int, val name: String) {
  var salary: Float = 0.0f
  var dept: String = "No_Dept"
  var sal_index: Double = 0.0
  //instance level functionality
  def salaryIncrementer: Double = salary * sal_index
}



val emp = new Employee(1, "Harry")
emp.name
//emp.id error
emp.salary = 100000f
emp.dept = "Data Technology"
emp.sal_index = 0.11
println(f"${emp.name} working in ${emp.dept} having salary ${emp.salary}%.2f")
println(f"${emp.name} proposed increment is ${emp.salaryIncrementer}%.2f")
println(f"${Employee.x}%.2f")
println(f"${Employee.indexer}")




val marry = Employee //from Object
val john = Employee //from Object
println(marry==john)

marry.x
marry.indexer
