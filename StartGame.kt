import kotlin.random.Random
//starts the game out deals 1 card to dealer and two to the player by default
fun StartGame(){

    //call drawcard to draw a card from the deck
    var tempCard = drawCard()
    //add card to dealers hand
    DealerHand.add(tempCard)
    //add score to dealers hand
    DealerScore+=tempCard

    //loop it for neat code
    //player drawing
    for(i in 1..2) {
        tempCard = drawCard()
        PlayerHand.add(tempCard)
        PlayerScore+=tempCard
    }
    //subtract players money
    PlayerMoney-=10

    //print out current dealer and players cards
    print("Dealer's cards:")
    print(DealerHand)

    print("\nPlayer's cards:")
    print(PlayerHand)

}


