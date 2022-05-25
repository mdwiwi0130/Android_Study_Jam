fun main(){
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age,layers)
}

fun printCakeTop(age : Int){
    repeat(age + 2){
        print("=")
	}
    println() 
}

fun printCakeCandles(age : Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()//換行
    print(" ")
    repeat(age){
        print("|")
    }
    println()
}

fun printCakeBottom(age : Int,layers : Int){
    //雙重迴圈
    repeat(layers){ //控制高
        repeat(age+2){   //控制寬度
            print("@")
        }
        println()
    }
}
