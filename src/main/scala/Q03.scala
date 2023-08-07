@main def Question_03: Unit = {
    print("Enter the integers : ")
    val inputStr = scala.io.StdIn.readLine()
    val inputList = inputStr.split(" ").map(_.toInt).toList

    val output = filterPrime(inputList)
    print("Prime numbers in the list: " + output.mkString(", "))}

val isPrime: Int => Boolean = n => {
    if(n <= 1){
        false
    }
    else if(n == 3 || n ==2){
        true
    }
    else{
    checkPrime(n, 2)
    }
}

def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
}

def checkPrime(n: Int, i: Int): Boolean = {
    if(i < n) {
        if(n % i == 0){
            false
        }
        else{
            checkPrime(n, i+1)
        }
    }
    else{
        true
    }
}