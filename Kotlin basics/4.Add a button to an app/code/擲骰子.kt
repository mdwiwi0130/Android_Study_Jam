fun main(){
    // 6面骰
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
    // 20面骰
    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled  ${mySecondDice.roll()}!")
}
class Dice(val numSides : Int){
    // 回傳值為Int型別
    fun roll():Int{
        //由1 ~ numSides，隨機選一數回傳
        return (1..numSides).random()
    }
}
