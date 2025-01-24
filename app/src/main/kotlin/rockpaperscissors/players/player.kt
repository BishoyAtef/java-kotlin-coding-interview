package players

import enums.MOVES
import enums.RESULTS
import strategies.PlayStrategy
import strategies.ConstantMoveStrategy
import strategies.RandomMoveStrategy

class Player constructor(val name : String, val playingStrategy : PlayStrategy) {
    var wins : Int = 0
    var loses : Int = 0
    var draws : Int = 0
    
    data class PlayerInfoCard(val name : String, val wins : Int, val loses : Int, val draws : Int)
    
    fun incremntWins() {
        wins++
    }

    fun incremntLoses() {
        loses++
    }

    fun incremntDraws() {
        draws++
    }

    fun updateState(result: RESULTS){
        when(result){
            RESULTS.WIN -> incremntWins()
            RESULTS.LOSE -> incremntLoses()
            RESULTS.DRAW -> incremntDraws()
        }
    }    

    fun play() : MOVES {
        return playingStrategy.start()
    }

    fun getPlayerInfoCard() : PlayerInfoCard {
        return PlayerInfoCard(name, wins, loses, draws)
    }

}