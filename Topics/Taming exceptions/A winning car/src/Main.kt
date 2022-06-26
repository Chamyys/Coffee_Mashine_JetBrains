fun findCar(): String {
    val maxSpeed = readln().toInt()
    val accTime = readln().toInt()

    if (maxSpeed >= 120 && accTime <= 4 && accTime > 0 && maxSpeed > 0 )return "I will definitely win!"
    else throw Exception("The race can't be won with this car")

}
