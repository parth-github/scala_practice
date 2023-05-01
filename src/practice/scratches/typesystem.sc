//type system
/**
 * AnyVal:
 * Char
 * Byte
 * Short
 * Int
 * Long
 * Float
 * Double
 *
 * Boolean
 *
 * Unit - void return type, eg. print()
 */

/**
 * AnyRef:- reference type
 * List
 * Seq
 * Tuple
 * String
 * Range
 * Array
 * Set
 */

/**
 * Any = AnyVal + AnyRef
 * Null - an object; valid only for AnyRef
 * Nothing - absence of a value
 * None -
 * Some
 * null - value
 */


var a: Int = 5
val c = print("Hello")
val b = if(a==5) 1 else 2.5 // type promotion
val d = if(a==6) 1 else 'e' // type promotion Char converted Int
val e: AnyVal = if(a==5) 1 else println("hello")
val f = if(a==5) 2 else List(1,2,3)

/**
 * Operators are functions
 */

a.compare(3)
a compare 3

a.*(b)
a * b








