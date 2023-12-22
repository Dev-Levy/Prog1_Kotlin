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

    //kiválasztás tétele - (hol van a tömbben páros szám?)
    fun selection(array: Array<Int>): Int {
        var i = 0
        while (i < array.size && array[i] % 2 != 0)
            i++
        if (i < array.size)
            return i
        else
            return 0
    }
}