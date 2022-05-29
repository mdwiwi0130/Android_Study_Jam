// if...else...
fun main() {
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4
    if (rollResult == luckyNumber)
        println("You win!")
    else
    	println("So sorry! You rolled a ${rollResult}. Try again!")
}

class Dice (val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
