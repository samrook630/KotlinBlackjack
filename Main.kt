//global variables to be used by many fuctions
var PlayerScore:Int = 0
var DealerScore:Int = 0
var Deck = mutableListOf<Int>()
var PlayerHand = mutableListOf<Int>()
var DealerHand = mutableListOf<Int>()
var gamesPlayed:Int = 0
var numCards:Int = 416
var PlayerMoney:Int = 1000

fun main(){


    println("Welcome to blackjack")

    //ask for number of players to be sent to Playgame
    print("How many players would like to play?")
    var temp = readLine()
    var numPlayer: Int? = temp!!.toInt()
    if (numPlayer != null) {
        playgame (numPlayer)
    }
    //initial next game question
    println("Would You like to play again?")
    var anothergame = readLine()
    if(anothergame == "n"){
        println("Have a nice Day, Goodbye")
    }

    //repeat until user says no and exit.
    while( anothergame != "n"){
        if (numPlayer != null) {
            playgame(numPlayer)
        }
        if(anothergame == "n"){
            println("Have a nice Day, Goodbye")
            break
        }
        println("Would You like to play again?")
        anothergame = readLine()
    }



}