//functions draws a new card & returns value of drawn card

fun drawCard(): Int {
    //draw new card "randomly"
    var temp = (0..numCards).random()
    var newCard = Deck[temp]
    //remove card from deck
    Deck.removeAt(temp)

    return newCard
}