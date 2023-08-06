@main def Question_01: Unit = {
    println("Enter a list of integers separated by spaces:")
    val inputStr = scala.io.StdIn.readLine()
    val inputList = inputStr.split(" ").map(_.toInt).toList

    val output = filterPrime(inputList)
    println("Prime numbers in the list: " + output.mkString(", "))}

val isPrime: Int => Boolean = n => {
    if (n <= 1) false
    else if (n == 3 || n ==2) true
    else if (n % 2 == 0 || n % 3 == 0) false
    else {
    var i = 5
    while (i < n) {
        if (n % i == 0) false
        i += 1
    }
    true
    }
}

def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
}