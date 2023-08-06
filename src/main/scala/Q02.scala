@main def Question_02: Unit = {
    print("Enter the integers: ")
    val inputStr = scala.io.StdIn.readLine()
    val inputList = inputStr.split(" ").map(_.toInt).toList

    val output = calculateSquare(inputList)
    print("Squares of the numbers: " + output.mkString(", "))}

def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)
}