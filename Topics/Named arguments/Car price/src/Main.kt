// complete this function, add default values
fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    var price = 20000
    price -= old * 2000 + kilometers / 10000 * 200
    if (maximumSpeed < 120) price -= (120 - maximumSpeed) * 100
    if (maximumSpeed > 120) price += (maximumSpeed - 120) * 100
    if (automatic) price += 1500
    println(price)
}
