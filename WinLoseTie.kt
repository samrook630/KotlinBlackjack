//function controls the outcome of a hand based on the dealer and players game

fun WinLoseTie(){

    println("Dealerhand:$DealerHand")
    println("Dealerscore:$DealerScore")
    println("Playerhand:$PlayerHand")
    println("PlayerScore:$PlayerScore")

    //player wins
    if (PlayerScore > DealerScore && PlayerScore < 22){
        println("Congratulations You WON!")
        PlayerMoney += 15
    }
    //Player Bust
    if(PlayerScore > 21){
        println("Sorry you busted...")
        PlayerMoney-+10
    }
    //Dealer Win
    if(DealerScore > PlayerScore && DealerScore <= 21){
        println("The Dealer has Won.")
    }
    //Tie
    if(DealerScore == PlayerScore){
        println("Tie all bets will be pushed.")
    }


    println("Players Current Money:$PlayerMoney")
}