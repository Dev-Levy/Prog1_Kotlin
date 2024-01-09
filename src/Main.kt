fun main() {
    println()
    val numArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val oddArray = arrayOf(1, 3, 5, 7, 9)
    val almostOddArray = arrayOf(1, 3, 5, 7, 8, 9)
    val randomArray = arrayOf(5, 2, 2, 8, 1, 9, 0, 1, 4, 5, 9)

    val sortedArray3 = arrayOf(1, 4, 7, 10, 13, 16)
    val sortedArray2 = arrayOf(0, 2, 4, 6, 8, 10)

    //region simple algos
//
//    val simple = SimpleProgAlgos()
//
//    arrayPrint(numArray)
//    val sum = simple.summation(numArray)
//    println("The sum of numbers in array: $sum")
//
//    println()
//
//    val odd = simple.decision(oddArray)
//    arrayPrint(oddArray)
//    println("The array contains an even number?\t$odd")
//
//    println()
//
//    val notOdd = simple.decision(almostOddArray)
//    arrayPrint(almostOddArray)
//    println("The array contains an even number?\t$notOdd")
//
//    println()
//
//    arrayPrint(oddArray)
//    val idx_odd = simple.selection(oddArray)
//    if (idx_odd == 0)
//        println("No even numbers in array!")
//    else
//        println("$idx_odd. number is even!")
//
//    println()
//
//    arrayPrint(almostOddArray)
//    val idx_even = simple.selection(almostOddArray)
//    if (idx_even == 0)
//        println("No even numbers in array!")
//    else
//        println("$idx_even. number is even!")
//
//    println()
//
//    val N = 23
//    val prime = simple.primeTest(N)
//    println("$N is prime? $prime")
//
//    println()
//
//    arrayPrint(almostOddArray)
//    val search = simple.linearSearch(almostOddArray)
//    if (search > 0)
//        println("Even number at ${search+1}. place in array")
//    else
//        println("No even numbers in the array")
//
//    println()
//
//    arrayPrint(numArray)
//    var count = simple.countEvens(numArray)
//    println("$count even numbers in this array")
//
//    println()
//
//    arrayPrint(randomArray)
//    var max = simple.max(randomArray)
//    println("Highest number at ${max+1}. place in array")
//
    //endregion

    //region complex algos
//
//    val complex = ComplexProgAlgos()
//
//    arrayPrint(randomArray)
//    arrayPrint(complex.negativecopy(randomArray))
//    println()
//
//    arrayPrint(randomArray)
//    val pair = complex.arrayEvenSelection(randomArray)
//    println("${pair.second} even numbers in array")
//    arrayPrint(pair.first)
//    println()
//
//    arrayPrint(randomArray)
//    val db = complex.arrayEvenSeparationInTheArray(randomArray)
//    println("${db+1} even number in array")
//    arrayPrint(randomArray)
//    println()
//
//
//    arrayPrint(almostOddArray)
//    arrayPrint(randomArray)
//    val intersection = complex.intersection(almostOddArray, randomArray)
//    println("${intersection.second} common numbers in these arrays")
//    arrayPrint(intersection.first)
//    println()
//
//    arrayPrint(almostOddArray)
//    arrayPrint(randomArray)
//    val union = complex.union(almostOddArray, randomArray)
//    println("${union.second} numbers in the union")
//    arrayPrint(union.first)
//    println()
//
//    arrayPrint(randomArray)
//    println("${complex.setMaker(randomArray)} different numbers in array")
//    arrayPrint(randomArray)
//    println()
//
//    arrayPrint(sortedArray2)
//    arrayPrint(sortedArray3)
//    println("${complex.runTogether(sortedArray2, sortedArray3).second} numbers in this array")
//    arrayPrint(complex.runTogether(sortedArray2, sortedArray3).first)
//    println()
//
//    val limit = 3
//    arrayPrint(sortedArray3)
//    if (complex.searchAndCountEvens(sortedArray3, limit) > 0)
//        println("There is $limit even numbers in this array")
//    else
//        println("There isn't $limit even numbers in this array")
//
//    val maxok = complex.maxSelection(randomArray)
    //endregion

    //region sorting algos
}

fun <T> arrayPrint(array: Array<T>) {
    for (i in array.indices) {
        val x = array[i]
        print("$x\t")
    }
    println()
}