package Algos

class SimpleProgAlgos {

    //sorozatszámítás tétele
    fun summation(array: Array<Int>): Int {
        var sum = 0

        for (i in array.indices)
            sum += array[i]

        return sum
    }

    //eldöntés tétele - (van a tömbben páros szám?)
    fun decision(array: Array<Int>): Boolean {
        var i = 0

        while (i < array.size && array[i] % 2 != 0)
            i++
        val bool = i < array.size

        return bool
    }

    fun primeTest(N: Int): Boolean {
        var i = 2;
        val root: Int = Math.sqrt(N.toDouble()).toInt()
        while (i <= root && !(N % i == 0))
            i++;

        return i > root;
    }

    //kiválasztás tétele - (hol van a tömbben páros szám?)
    fun selection(array: Array<Int>): Int {
        var i = 0
        while (i < array.size && array[i] % 2 != 0)
            i++
        if (i < array.size)
            return i + 1
        else
            return 0
    }

    fun linearSearch(array: Array<Int>): Int {
        var i = 0;
        while (i < array.size && array[i] % 2 != 0) {
            i++;
        }
        val van = i < array.size
        if (van)
            return i;
        else
            return 0;
    }

    fun countEvens(array: Array<Int>): Int {
        var db = 0
        for (i in array.indices) {
            if (array[i] % 2 == 0)
                db++
        }
        return db
    }

    fun max(array: Array<Int>): Int {
        var max = 0

        for (i in 1..< array.size) {
            if (array[i] > array[max])
                max = i
        }

        return max
    }
}