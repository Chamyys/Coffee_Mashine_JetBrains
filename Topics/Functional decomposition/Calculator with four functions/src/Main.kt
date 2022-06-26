// Implement your functions here
fun subtractTwoNumbers(a: Long, b: Long) {
    println(a-b)
}


fun sumTwoNumbers(a: Long, b: Long) {
    println(a+b)
}


fun divideTwoNumbers(a: Long, b: Long) {
    try {
    println(a/b)
    }
    catch (e: java.lang.Exception) {
    println("Division by 0!")
    }
}


fun multiplyTwoNumbers(a: Long, b: Long) {
    println(a*b)
}