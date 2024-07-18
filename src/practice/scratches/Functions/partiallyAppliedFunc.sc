/**
 * Partially applied function:
 * Creating a new function from another existing function
 * by fixing one or more parameters in function
 */


// define a divide function
def divideFunc(x: Double, y: Double) = x/y
// call the function
divideFunc(10,2)

// create another function to inverse
// by fixing x = 1
val inverseFunc = divideFunc(1, _:Double)
// call the function
inverseFunc(45)
inverseFunc(9)



