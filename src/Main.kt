import kotlin.random.Random

fun main() {

    //region sorting algos
    val sorts = SortingProgAlgos()
    val sw = Stopwatch()

    //testing the sortings
    val r = RandomTestArray()
    arrayPrint(r)
    sorts.improvedInsertionSort(r)
    arrayPrint(r)

    sw.start()
    sorts.improvedBubbleSort(RandomArray())
    println("SimpleSwapSort took ${sw.stop()} ms")
    println()


    sw.start()
    sorts.minSelectionSort(RandomArray())
    println("MinSelectionSort took ${sw.stop()} ms")
    println()

    sw.start()
    sorts.bubbleSort(RandomArray())
    println("BubbleSort took ${sw.stop()} ms")
    println()

    sw.start()
    sorts.improvedBubbleSort(RandomArray())
    println("ImprovedBubbleSort took ${sw.stop()} ms")
    println()

    sw.start()
    sorts.insertionSort(RandomArray())
    println("InsertionSort took ${sw.stop()} ms")
    println()

    sw.start()
    sorts.improvedInsertionSort(RandomArray())
    println("ImprovedInsertionSort took ${sw.stop()} ms")
    println()

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