package machine
import java.util.*
class CofeeMashine {
    companion object {
        var STOREWATER : Int = 400
        var STOREMILK : Int = 540
        var STOREBEANS : Int = 120
        var STORECUPS : Int = 9
        var STOREMONEY : Int = 550
        fun showstored() {
            println("The coffee machine has:\n" +
                    "$STOREWATER ml of water\n" +
                    "$STOREMILK ml of milk\n" +
                    "$STOREBEANS g of coffee beans\n" +
                    "$STORECUPS disposable cups\n" +
                    "$$STOREMONEY of money")
        }
        fun addIngredients() {
            println("Write how many ml of water do you want to add:")
            CofeeMashine.STOREWATER += readln().toInt()
            println("Write how many ml of milk do you want to add:")
            CofeeMashine.STOREMILK += readln().toInt()
            println("Write how many grams of coffee beans do you want to add:")
            CofeeMashine.STOREBEANS += readln().toInt()
            println("Write how many disposable cups of coffee do you want to add:")
            CofeeMashine.STORECUPS += readln().toInt()
        }
    }
}
object MakingCoffee {
    fun cappuccino() {
        CofeeMashine.STOREWATER -= 200
        CofeeMashine.STORECUPS--
        CofeeMashine.STOREBEANS -= 12
        CofeeMashine.STOREMILK -= 100
        CofeeMashine.STOREMONEY += 6
    }

    fun espresso() {
        CofeeMashine.STOREWATER -= 250
        CofeeMashine.STORECUPS--
        CofeeMashine.STOREBEANS -= 16
        CofeeMashine.STOREMONEY += 4
    }

    fun latte() {
        CofeeMashine.STOREWATER -= 350
        CofeeMashine.STORECUPS--
        CofeeMashine.STOREBEANS -= 20
        CofeeMashine.STOREMILK -= 75
        CofeeMashine.STOREMONEY += 7
    }
    fun CanIMakeACoffe (coffee : String = "espresso") : Boolean {
        when (coffee) {
            "espresso" -> {
                if (CofeeMashine.STOREWATER < Reciepts.ESPRESSO.water) {
                    println("Sorry, not enough water!")
                    return false
                } else if (CofeeMashine.STORECUPS < Reciepts.ESPRESSO.cups) {
                    println("Sorry, not enough cups!")
                    return false
                } else if (CofeeMashine.STOREBEANS < Reciepts.ESPRESSO.beans) {
                    println("Sorry, not enough coffee!")
                    return false
                } else return true
            }
            "latte" -> {
                if (CofeeMashine.STOREWATER < Reciepts.LATTE.water) {
                    println("Sorry, not enough water!")
                    return false
                } else if (CofeeMashine.STORECUPS < Reciepts.LATTE.cups) {
                    println("Sorry, not enough cups!")
                    return false
                } else if (CofeeMashine.STOREBEANS < Reciepts.LATTE.beans) {
                    println("Sorry, not enough coffee!")
                    return false
                } else if (CofeeMashine.STOREMILK < Reciepts.LATTE.milk) {
                    println("Sorry, not enough milk!")
                    return false
                } else return true
            }
            "cappuccino" -> {
                if (CofeeMashine.STOREWATER < Reciepts.CAPPUCINO.water) {
                    println("Sorry, not enough water!")
                    return false
                } else if (CofeeMashine.STORECUPS < Reciepts.CAPPUCINO.cups) {
                    println("Sorry, not enough cups!")
                    return false
                } else if (CofeeMashine.STOREBEANS < Reciepts.CAPPUCINO.beans) {
                    println("Sorry, not enough coffee!")
                    return false
                } else if (CofeeMashine.STOREMILK < Reciepts.CAPPUCINO.milk) {
                    println("Sorry, not enough milk!")
                    return false
                }else return true
            }
            else -> return false
        }

    }
}
enum class Reciepts(var water: Int, var cups: Int, var beans: Int, var milk: Int){
    ESPRESSO(250, 1,16,0),
    LATTE(350,1,20,75),
    CAPPUCINO(200, 1, 12, 100)
}


fun main() {
    usermenu()
}

fun usermenu() {
    println("")
    println("Write action (buy, fill, take, remaining, exit):")
    var path = readln()
    when (path) {
        "buy" -> {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
            when (readln()) {
                "1" -> {
                    if (MakingCoffee.CanIMakeACoffe("espresso")) {
                        println("I have enough resources, making you a coffee!")
                        MakingCoffee.espresso()
                    }
                    usermenu()
                }
                "2" -> {
                    if (MakingCoffee.CanIMakeACoffe("espresso")) {
                        println("I have enough resources, making you a coffee!")
                        MakingCoffee.latte()
                    }
                    usermenu()
                }
                "3" -> {
                    if (MakingCoffee.CanIMakeACoffe("espresso")) {
                        println("I have enough resources, making you a coffee!")
                        MakingCoffee.cappuccino()
                    }
                    usermenu()
                }
                "back" -> usermenu()
            }

        }
        "fill" -> {
            CofeeMashine.addIngredients()
            usermenu()
        }
        "take" -> {
            takemoney ()
            usermenu()
        }
        "remaining" -> {
            CofeeMashine.showstored()
            usermenu()
        }
        "exit" -> ""
    }

}
fun takemoney() {
    println("I gave you $${CofeeMashine.STOREMONEY}")
    CofeeMashine.STOREMONEY = 0
}
