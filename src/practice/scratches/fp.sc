// define a function
def squareIt(x: Int): Int = {
  return x*x
}

// Type of parameter is mandatory
def squareItV2(x: Int) = x * x

// Calling the function
val y = squareIt(35)
val z = squareItV2(45)
print(y, z)

//val sqItV3 = val x:Int => x*x

def cubeIt(x: Int) = x * x * x
println(s"Cube of 30 is ${cubeIt(30)}")

// passing a function (1st order) as parameter of another function (High order)
def transformInt(x: Int, f:Int => Int): Int = f(x)

transformInt(2, squareIt) // squareIt(2)
transformInt(3, cubeIt)

// for single time use, passing anonymous function as parameter to high order function
transformInt(4, x => x*x*x)

////// First order function
def divideByTwo(x: Int) = x/2
divideByTwo(2)
transformInt(6, divideByTwo)
transformInt(6, x => x/2)
transformInt(7, x => {var y = x * 2; y * y})

// Anonymous func
// Applying to collection
val a = 1 to 10
a.map((x:Int)=>2*x)

def doubler(x:Int) ={x*2}
a.map(doubler)

def doublerV2 = (x:Int) => 2 * x
a.map(doublerV2)

//Placeholder Syntax
a.map(_ * 2)

a.reduce((x:Int, y:Int) => x + y)
a.reduce(_ + _) //Parameters are replaced in sequence










