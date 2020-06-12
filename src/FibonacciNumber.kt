fun main() {
    fibonacciIteration(10)
    println()
    for (i in 0 until 10) {
        print("${fibonacciRecursion(i)}")
    }

}

fun fibonacciIteration(limit: Int) {
    var t1 = 0
    var num = 1
    for (i in (0..limit)) {
        print("$t1 ")
        val sum = num + t1
        t1 = num
        num = sum
    }
}

fun fibonacciRecursion(n: Int): Int = if (n == 0 || n == 1) {
    n
} else {
    fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2)
}

