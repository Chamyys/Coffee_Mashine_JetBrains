fun f(x: Double): Double {
       when {
       x <= 0.0 -> return f1(x)
       (0 < x && x < 1) -> return f2(x)
       else -> return f3(x)
    }
}

// implement your functions here
fun f1(x: Double): Double {
    return x * x + 1
}

fun f2(x: Double): Double {
    return 1/(x * x)
}
fun f3(x: Double): Double {
    return x * x - 1
}