//function that controls the players ability to play the game
fun PlayerPlay(): Boolean {

    //ask user to hit y/n
    println("\nHit? y/n:")
    var hit = readLine()

    //while loop to continue to allow user to hit.
    while(hit != "n" && PlayerScore <= 21){
        var temp = drawCard()
        PlayerHand.add(temp)
        PlayerScore+=temp
        println(PlayerHand)

        //ask player to hit again
        println("\nHit? y/n:")
        var hit = readLine()
        if(hit == "n"){
            break
        }

        if(PlayerScore >= 22){
            break
        }
    }

    if(PlayerScore > 21){
        return true
    }else{
        return false
    }
}