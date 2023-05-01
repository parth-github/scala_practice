// Multi case comparison

val num = 3f

num match {
  case 11.09 => print(s"One $num")
  case 2 => print(num)
  case 3 => print(num)
  case _ => print("Something else")
}

// Or with if-else if--else
if (num == 1) print(s"One $num")
else if (num == 2) print(s"Two $num")
else if (num == 3) print(s"Three $num")
else print(s"Something else.." + num)
