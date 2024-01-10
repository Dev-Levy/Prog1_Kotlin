package Algos

import java.util.ArrayDeque

class RecursiveProgAlgos {

    fun factorial(N: Int): Long {
        if (N == 0)
            return 1
        else {
            val asd = N * factorial(N - 1)
            return asd
        }

    }

    fun fibonacci(N: Int): Long {
        if (N <= 1)
            return 1
        else {
            val asd = fibonacci(N - 2) + fibonacci(N - 1)
            return asd
        }
    }

    fun mathPower(a: Long, N: Int): Long {
        if (N == 1)
            return a
        else {
            return a * mathPower(a, N - 1)
        }
    }

    fun mathHalfPower(a: Long, N: Int): Long {
        if (N == 1)
            return a
        else {
            if (N % 2 == 0) {
                val helper = mathHalfPower(a, N / 2)
                return helper * helper
            } else {
                val helper = mathHalfPower(a, (N - 1) / 2)
                return a * helper * helper
            }
        }
    }

    fun hanoi(N: Int, forras: ArrayDeque<Int>, cel: ArrayDeque<Int>, seged: ArrayDeque<Int>) {
        if (N == 1)
            move(forras, cel)
        else {
            hanoi(N - 1, forras, seged, cel)
            move(forras, cel)
            hanoi(N - 1, seged, cel, forras)
        }
    }

    fun move(A: ArrayDeque<Int>, C: ArrayDeque<Int>) {
        C.push(A.pop())
    }

    fun recursiveSummation(array: Array<Int>, right: Int): Int {
        if (right < 0)
            return array[0]
        else
            return array[right] + recursiveSummation(array, right - 1)
    }

    fun recursiveLinearSearch(array: Array<Int>, left: Int): Int {
        if (left > array.size - 1)
            return 0
        else {
            if (array[left] % 2 == 0)
                return left
            else
                return recursiveLinearSearch(array, left + 1)
        }
    }

    fun recursiveCountEvens(array: Array<Int>, right: Int): Int {
        if (right < 0)
            return 0
        else {
            if (array[right] % 2 == 0)
                return 1 + recursiveCountEvens(array, right - 1)
            else
                return recursiveSummation(array, right - 1)
        }
    }

    fun recursiveMax(array: Array<Int>, right: Int): Int{
        if (right==0)
            return 0
        else{
            val max = recursiveMax(array,right-1)
            if (array[right]> array[max])
                return right
            else
                return max
        }
    }
}