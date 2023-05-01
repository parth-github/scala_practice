// Expression block
// last statement is return value
{
  var x = 10
  x += 20
  x
}

// Expression block
{
  7
}

// Expression block with assignment
// no return is Unit or Void
val abc = {
  val y = 10
}: Unit
abc

//
val bcd = {
  val z = 100
  z
}: Int
bcd
print(bcd)

//Oneliner expression
print({val x = 10; x + 20; x})







