//main function that runs the game calls all other functions and handles when game ends.
fun playgame (numPlayer: Int){

    if(gamesPlayed == 0) initDeck()

    StartGame()
    gamesPlayed+=1
    var bust = PlayerPlay()

    if(bust == true){
        WinLoseTie()
    }else {
    DealerPlay()
    WinLoseTie()
    }

    resetHands()
    shuffle()
}