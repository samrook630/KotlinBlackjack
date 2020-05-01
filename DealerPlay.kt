//handles dealer play dealer will stand at a score of 17 or higher
fun DealerPlay(){

    //drawn card add it to dealers hand and score points print out dealers hand
    var temp = drawCard()
    DealerHand.add(temp)
    DealerScore+=temp
    println(DealerHand)

    while(DealerScore < 17){
        temp = drawCard()
        DealerHand.add(temp)
        DealerScore+=temp
        println(DealerHand)
    }

}