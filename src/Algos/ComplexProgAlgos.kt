package Algos

class ComplexProgAlgos {

    fun negativecopy(array: Array<Int>): Array<Int> {
        val out = Array(array.size) { 0 }
        for (i in array.indices) {
            out[i] = array[i] * (-1)
        }
        return out
    }

    fun arrayEvenSelection(array: Array<Int>): Pair<Array<Int>, Int> {
        var out = Array(array.size) { 0 }
        var db = 0

        for (i in array.indices) {
            if (array[i] % 2 == 0) {
                out[db] = array[i]
                db++
            }
        }

        return Pair(out, db)
    }

    fun arrayEvenSelectionInTheArray(array: Array<Int>): Pair<Array<Int>, Int> {
        var db = 0

        for (i in array.indices) {
            if (array[i] % 2 == 0) {
                var help = array[db]
                array[db] = array[i]
                array[i] = help
                db++
            }
        }

        return Pair(array, db)
    }

    fun arrayEvenSeparationInTheArray(array: Array<Int>): Int {
        var bal = 0
        var jobb = array.size - 1
        val seged = array[0]
        while (bal < jobb) {
            while (bal < jobb && array[jobb] % 2 != 0) jobb--
            if (bal < jobb) {
                array[bal] = array[jobb]
                bal++
            }
            while (bal < jobb && array[bal] % 2 == 0) bal++
            if (bal < jobb) {
                array[jobb] = array[bal]
                jobb--
            }
        }
        array[bal] = seged
        if (seged % 2 == 0) return bal
        else return bal - 1

    }

    fun intersection(array1: Array<Int>, array2: Array<Int>): Pair<Array<Int>, Int> {
        val intersection = Array(array1.size) { 0 }
        var db = 0
        for (i in array1.indices) {
            var j = 0
            while (j < array2.size && array1[i] != array2[j]) j++
            if (j < array2.size) {
                intersection[db] = array1[i]
                db++
            }
        }

        return Pair(intersection, db)
    }

    fun union(array1: Array<Int>, array2: Array<Int>): Pair<Array<Int>, Int> {
        val union = Array(array1.size + array2.size) { 0 }
        for (i in array1.indices) {
            union[i] = array1[i]
        }
        var db = array1.size
        for (j in array2.indices) {
            var i = 0
            while (i < array1.size && array1[i] != array2[j]) i++
            if (i >= array1.size) {
                union[db] = array2[j]
                db++
            }
        }
        return Pair(union, db)
    }

    fun setMaker(array: Array<Int>): Int {
        var db = 1
        for (i in 1..array.size - 1) {
            var j = 0
            while (j <= db && array[i] != array[j])
                j++
            if (j > db) {
                db++
                array[db] = array[i]
            }
        }
        return db + 1
    }

    fun runTogether(array1: Array<Int>, array2: Array<Int>): Pair<Array<Int>, Int> {
        val runtogether = Array(array1.size + array2.size) { 0 }
        var i = 0
        var j = 0
        var db = 0
        while (i < array1.size && j < array2.size) {
            if (array1[i] < array2[j]) {
                runtogether[db] = array1[i++]
            } else if (array1[i] > array2[j]) {
                runtogether[db] = array2[j++]
            } else {
                runtogether[db] = array1[i]
                i++
                j++
            }
            db++
        }
        while (i < array1.size) {
            runtogether[db] = array1[i++]
            db++
        }
        while (j < array2.size) {
            runtogether[db] = array2[j++]
            db++
        }

        return Pair(runtogether, db)
    }

    fun searchAndCountEvens(array: Array<Int>, limit: Int): Int {
        var db = 0
        var i = 0
        while (i < array.size && db < limit) {
            if (array[i] % 2 == 0)
                db++
            i++
        }
        var bool = db == limit
        if (bool)
            return i
        else
            return 0
    }

    fun maxSelection(array: Array<Int>): Triple<Array<Int>, Int, Int> {
        val maxok = Array(array.size) { 0 }
        var maxValue = array[0]
        var db = 0
        maxok[db] = 1
        for (i in 1..maxok.size - 1){
            if (array[i] > maxValue){
                maxok[db] = i
                db = 1
                maxValue = array[i]
            }
            else if (array[i] == maxValue){
                maxok[db] = i
                db++
            }
        }
        return Triple(maxok, db, maxValue)
    }
}