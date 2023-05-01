//Functional Programming
//OOP + FP
//Good for library design and data crunching
//Pure functions and immutable values

/**
Pure function:
 1. The input solely determines the output
 2. The function doesn't change its input value
 3. There are no side effects, the function only do whatever it is intended for.

 */

def dollarToRupees(x: Int) = x * 80

def convertCurrency(x: Int, f: Int => Int) = f(x)

convertCurrency(40, dollarToRupees)

// Pure function
def func1Pure(i:Int, a:Int):Int = a + i
def funct2Pure(a: Int): Int = a + 1
def funct3Pure(i: Int) = i


var extVar = 5
def funct1Impure(i: Int): Int = extVar + i
//def funct2Impure(i: Int): Int = {i = i + 1; i}
def func3Impure(i: Int) = { println("hello"); i}

