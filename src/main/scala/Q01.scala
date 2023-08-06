@main def Question_01: Unit = {
  print("Enter the integers: ")
    val inputStr = scala.io.StdIn.readLine()
    val inputList = inputStr.split(" ").map(_.toInt).toList

    val output = filterEvenNumbers(inputList)
    print("Even numbers in the list: " + output.mkString(", "))
}
    
def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(number => number % 2 == 0)
}