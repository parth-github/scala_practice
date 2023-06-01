/*
* Factory Design Pattern:
* Separate the instance creation logic from the client.
* Instance creation logic is implemented in a Factory Class.
* Benefits: Loose-coupling, clear separation of responsibilities.
* Easy to change object creation logic without effecting client code.
*/

/*
* Write a trait
* Define un-implemtented methods.
* Extend the trait in a case class.
* Create a Factory class and create the instances
*
 */


trait Computer {
  def ram: String
  def cpu: String
  def hdd: String
}

case class PersonalComputer(ram:String, cpu:String, hdd:String) extends Computer
case class Laptop(ram:String, cpu:String, hdd:String) extends Computer

object ComputerFactory {
  def apply(compType:String, ram:String, hdd:String, cpu:String) = compType match{
    case "PersonalComputer" => PersonalComputer(ram, cpu, hdd)
    case "Laptop" => Laptop(ram, cpu, hdd)
  }

}

ComputerFactory("PC", "16gb", "2.3ghz", "1tb")


ComputerFactory("Laptop", "8gb", "3ghz", "500gb")

