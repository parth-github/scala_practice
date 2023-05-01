// type inference
val x = 3455

// Integers
var numInteger: Int = 1000000000 // <10^9
var numLong = 12345L // <10^18
var numLong1: Long = 12345L

// Decimal
var decimalDouble = 3.14567345345
var decimalFloat = 3.1456f

// Boolean
var isAvailable = true
var isAlive: Boolean = false

// String
var stringValue = "Hi there"
// String with s-interpolation
var anotherString = s"string value is ${stringValue}"
// String with f-interpolation
var sString = f"$decimalDouble%.3f"
println(sString)

// String with raw-interpolation
var rawString = "hello \n world"
println(raw"$rawString")
println("hello \n\r world")
println(raw"hello \n world")

// Char
val aCharacter = 'h' // Single quote for Char
val bChar = "a" // Double quote for String

// Boolean, char string comparisons
val isEquals = bChar == aCharacter




