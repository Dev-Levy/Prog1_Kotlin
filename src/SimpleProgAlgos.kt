class SimpleProgAlgos {

    //sorozatszámítás tétel
    fun summation(array: Array<Int>): Int {
        var sum = 0

        for (i in array.indices)
            sum += array[i]

        return sum
    }

    //eldöntés tétele
    fun decision(array: Array<Int>): Boolean {
        var i = 0

        while (i < array.size && array[i] % 2 != 0)
            i++
        val bool = i < array.size

        return bool
    }


}