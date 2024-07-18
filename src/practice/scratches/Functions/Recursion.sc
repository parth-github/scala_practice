//Loop vs recursion vs tail recursion
//  find factorial of a number
//loop
def factorial(input: Int): Int = {
  var result: Int = 1
  for(i <- 1 to input)
  {
    result = result * i
  }
  result
}
//recursion
def factorial(input: Int): Int = {
  if (input == 1) 1
  else input * factorial(input-1)
}
//factorial(5)
//5 * factorial(4)
//5 * 4 * factorial(3)
//5 * 4 * 3 * factorial(2)
//5 * 4 * 3 * 2 * factorial(1)
//5 * 4 * 3 * 2 * 1
//tail recursion
def factorial(input: Int , result: Int): Int = {
  if(input == 1) result
  else factorial(input-1,result*input)
}
factorial(1,24)
//what tail recursion says is that the recursive call should
//  be the last statement in the function