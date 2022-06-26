class Intern(val weeklyWorkload: Int) {
    val baseWorkload = 20

    class Salary {
        val basePay = 50
        val extraHoursPay = 2.8
    }
    var a: Salary = Salary()
    val weeklySalary: Double = if (weeklyWorkload > baseWorkload) {
        a.basePay + a.extraHoursPay * (weeklyWorkload - baseWorkload).toDouble()
    } else a.basePay.toDouble()
}