/* Function Currying
*
 */
def genericSum(f: Int => Int)(x: Int, y: Int) = {
  f(x) + f(y)
}

genericSum(x => x*x) (3,4)
//or
val sumOfSquares = genericSum(x=>x*x)_

sumOfSquares(3,4)
