import java.math.*
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextLine()
    var b = scanner.nextInt().toDouble()
    when (a) {
        "amount" -> println(calc(amount = b))
        "percent" -> println(calc(percent = b))
        "years" -> println(calc(years = b))
    }
}
fun calc(amount: Double = 1000.0, percent: Double = 5.0, years: Double = 10.0): Int {
    var fin = amount * Math.pow((1 + percent/100), years)
    return fin.toInt()
}