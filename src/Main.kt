fun main() {
    println()
    val numArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val oddArray = arrayOf(1, 3, 5, 7, 9)
    val almostOddArray = arrayOf(1, 3, 5, 7, 8, 9)

    val simple = SimpleProgAlgos()

    arrayPrint(numArray)
    val sum = simple.summation(numArray)
    println("The sum of numbers in array: $sum")

    println()

    val odd = simple.decision(oddArray)
    arrayPrint(oddArray)
    println("The array contains an even number?\t$odd")

    println()

    val notOdd = simple.decision(almostOddArray)
    arrayPrint(almostOddArray)
    println("The array contains an even number?\t$notOdd")

    println()

    arrayPrint(oddArray)
    val idx_odd = simple.selection(oddArray)
    if (idx_odd==0)
        println("No even numbers in array!")
    else
        println("$idx_odd. number is even!")

    println()

    arrayPrint(almostOddArray)
    val idx_even = simple.selection(almostOddArray)
    if (idx_even==0)
        println("No even numbers in array!")
    else
        println("$idx_even. number is even!")

    println()

    val N = 23
    val prime = simple.primeTest(N)
    println("$N is prime? $prime")

}

fun <T> arrayPrint(array: Array<T>) {
    for (i in array.indices) {
        val x = array[i]
        print("$x\t")
    }
    println()
}