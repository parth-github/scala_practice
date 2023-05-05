/**
 * How to handle Nulls
 */

case class Address(city: String, state: String, zip: String)

class User(email: String, password: String) {
  var firstName: String = _ //assigning null
  var lastName: String = _
  var address: Address = _
}

val user = new User("email@example.org", "abcd")
//returns a null
println(user.firstName)

//to solve the above problem
class User1(email: String, password: String) {
  var firstName: Option[String] = None
  var lastName: Option[String] = None
  var address: Option[Address] = None
}

val user1 = new User1("email@example.org", "abcd")
println(user1.firstName.getOrElse("Not assigned")) //Returns None with message

user1.firstName = Some("Potter")
user1.lastName = Some("Harry")
user1.address = Some(Address("San Fransisco", "California", "11025"))

println(user1.firstName.getOrElse("Not assigned")) //Returns None with message
println(user1.address.getOrElse("Not assigned")) //Returns None with message



