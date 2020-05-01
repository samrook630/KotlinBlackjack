fun initDeck(){

    //empty out deck
    Deck.clear()
    //for loop all cards
    for(i in 2..11) {
        //check if adding king through jack
        if(i == 10){
            //add all 128 10 value cards in a 8 deck game of Blackjack
            for(j in 1..128) {
                Deck.add(i)
            }
            //else add 32 cards of values from 2 to 11
        }  else {
            for(q in 1..32){
                Deck.add(i)
                }
            }
        }
}


