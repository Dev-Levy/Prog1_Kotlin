import Algos.RecursiveProgAlgos
import Algos.SortingProgAlgos
import kotlin.math.cos
import kotlin.random.Random
import java.util.ArrayDeque

fun main() {
    val sw = Stopwatch()

    //region sorting algos
//    val sorts = SortingProgAlgos()
//
//    //testing the sortings
//    val r = RandomTestArray()
//    arrayPrint(r)
//    sorts.improvedInsertionSort(r)
//    arrayPrint(r)
//
//    sw.start()
//    sorts.improvedBubbleSort(RandomArray())
//    println("SimpleSwapSort took ${sw.stop()} ms")
//    println()
//
//
//    sw.start()
//    sorts.minSelectionSort(RandomArray())
//    println("MinSelectionSort took ${sw.stop()} ms")
//    println()
//
//    sw.start()
//    sorts.bubbleSort(RandomArray())
//    println("BubbleSort took ${sw.stop()} ms")
//    println()
//
//    sw.start()
//    sorts.improvedBubbleSort(RandomArray())
//    println("ImprovedBubbleSort took ${sw.stop()} ms")
//    println()
//
//    sw.start()
//    sorts.insertionSort(RandomArray())
//    println("InsertionSort took ${sw.stop()} ms")
//    println()
//
//    sw.start()
//    sorts.improvedInsertionSort(RandomArray())
//    println("ImprovedInsertionSort took ${sw.stop()} ms")
//    println()

    //endregion

    //region recursive algos
//    val recursive = RecursiveProgAlgos()
////
////    val factorial12 = recursive.factorial(12)
////    val fibonacci10 = recursive.fibonacci(10)
////
////    sw.start()
////    val times = 100000000
////    for (i in 1..times)
////        recursive.mathPower(2, 10)
////    println("$times*RecursiveMathPow took ${sw.stop()} ms")
////
////    sw.start()
////    for (i in 1..times)
////        recursive.mathHalfPower(2, 10)
////    println("$times*RecursiveMathHalfPow took ${sw.stop()} ms")
//
//    val forras = ArrayDeque<Int>()
//    val seged = ArrayDeque<Int>()
//    val cel = ArrayDeque<Int>()
//    forras.push(4)
//    forras.push(3)
//    forras.push(2)
//    forras.push(1)
//    recursive.hanoi(forras.size, forras,cel,seged)
//
//    val tens = arrayOf(10,10,10,10,10,10,10,10,10,10)
//
//    val sum = recursive.recursiveSummation(tens, tens.size-1)
//
//    val almostOdd = arrayOf(1,3,5)
//
//    val find = recursive.recursiveLinearSearch(almostOdd, 0)
//
//    val count = recursive.recursiveCountEvens(tens, tens.size-1)
//
//    val max = recursive.recursiveMax(almostOdd, almostOdd.size-1)
    //endregion

}
fun <T> arrayPrint(array: Array<T>) {
    for (i in array.indices) {
        val x = array[i]
        print("$x\t")
    }
    println()
}

fun RandomArray(): Array<Int> {
    val array = Array(100000) { 0 }
    for (i in array.indices)
        array[i] = Random.nextInt(0, 100)
    return array
}

fun RandomTestArray(): Array<Int> {
    val array = Array(100) { 0 }
    for (i in array.indices)
        array[i] = Random.nextInt(0, 100)
    return array
}
