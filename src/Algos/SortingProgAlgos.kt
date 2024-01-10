package Algos

class SortingProgAlgos {

    fun simpleSwapSort(array: Array<Int>) {
        for (i in 0..array.size - 2)
            for (j in i + 1..array.size - 1) {
                if (array[i] > array[j]) {
                    var helper = array[i]
                    array[i] = array[j]
                    array[j] = helper
                }
            }
    }

    fun minSelectionSort(array: Array<Int>) {
        for (i in 0..array.size - 2) {
            var min = i
            for (j in i + 1..array.size - 1) {
                if (array[min] > array[j])
                    min = j
            }
            var helper = array[i]
            array[i] = array[min]
            array[min] = helper
        }
    }

    fun bubbleSort(array: Array<Int>) {
        for (i in array.size - 1 downTo 1)
            for (j in 0..i - 1) {
                if (array[j] > array[j + 1]) {
                    var helper = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = helper
                }
            }
    }

    fun improvedBubbleSort(array: Array<Int>) {
        var i = array.size - 1
        while (i >= 1) {
            var idx = 0
            for (j in 0..i - 1) {
                if (array[j] > array[j + 1]) {
                    var helper = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = helper

                    idx = j
                }
            }
            i = idx
        }
    }

    fun insertionSort(array: Array<Int>) {
        for (i in 1..array.size - 1) {
            var j = i - 1
            while (j >= 0 && array[j] > array[j + 1]) {
                var helper = array[j]
                array[j] = array[j + 1]
                array[j + 1] = helper
                j--
            }
        }
    }

    fun improvedInsertionSort(array: Array<Int>) {
        for (i in 1..array.size - 1) {
            var j = i - 1
            var seged = array[i]
            while (j >= 0 && array[j] > seged) {
                array[j + 1] = array[j]
                j--
            }
            array[j + 1] = seged
        }
    }

}