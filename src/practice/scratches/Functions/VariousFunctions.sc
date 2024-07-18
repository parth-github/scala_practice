// Pure Function
// sqrt(4) // Referenetially transparent
// dollarsToRs(40) // Not referntially transparent


// First class function
// 1. assigning function to a variable
def doubler(i: Int): Int = {
  i * 2
}
val a = doubler(_)
//a(2)

// 2. we should be able to pass a function as
//parameter to the function

def tripler(i: Int): Int = {
  i * 3
}
def func(i: Int, f: Int => Int) = {
  f(i)
}
func(5, tripler)

// 3. we should be able to return a function from a
//function
def func = {
  x:Int => x * x
}

// Higher Order Function
//A function which either takes a function as input
//parameter or returns another function as its output

var a = 1 to 10
def doubler(i: Int): Int = {
  i * 2
}
a.map(doubler)

// Anonymous function
// A function without a name.
a.map(x => x * 2)

//immutability is more preferred.
var a = 5
a = 6

val b = 7
//b = 8 //can't change val
//val is preferred over var

