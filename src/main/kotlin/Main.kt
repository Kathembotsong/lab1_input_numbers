fun main(args: Array<String>) {
    //the code allowing the user to input a number
    println("Enter a number: ")
    //operator ensure the input is not null
    val stringInput = readLine()!!

    //convert the string input to integer
    var integer:Int = stringInput.toInt()

    //println()
    println("You entered: $integer")

//    // Addition of stored numbers
//    val first: Int  = 10
//    val second: Int = 20
//
//    val sum = first + second
//    println("The sum is : $sum")
}