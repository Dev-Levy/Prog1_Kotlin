class Stopwatch {
    private var startTime: Long = 0
    private var isRunning: Boolean = false

    fun start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis()
            isRunning = true
        }
    }

    fun stop(): Long {
        if (isRunning) {
            val elapsedTime = System.currentTimeMillis() - startTime
            isRunning = false
            return elapsedTime
        }
        return 0
    }
}