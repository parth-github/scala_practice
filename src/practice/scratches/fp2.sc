// Partially applied functions
def divideBy(x:Double, y:Double) = x/y
divideBy(4, 2)

// When one or more of the param is fixed
val inverse = divideBy(1, _)
inverse(12)

(1 to 10).map(1/_)



/**
 * 4  5   9
 * 4  5   41
 *  4 5   189
 */

def genericSum(x:Int, y:Int, f:Int => Int) = {
  f(x) + f(y)
}
genericSum(4,5,x => x)
genericSum(4,5,x => x*x)
genericSum(4,5,x => x*x*x)

val sumOfSquares = genericSum(_:Int, _:Int, x => x*x)

sumOfSquares(4,5)

val sumOfCubes = genericSum(_:Int, _:Int, x => x*x*x)
sumOfCubes(4,5)


//function currying - logical grouping of params, Syntatic sugar
def genericSum(f:Int => Int) (x:Int, y:Int)  = {
  f(x) + f(y)
}
genericSum(x => x) (4,5)

val sumOfSquares = genericSum(x=>x*x)_
sumOfSquares(4,5)


