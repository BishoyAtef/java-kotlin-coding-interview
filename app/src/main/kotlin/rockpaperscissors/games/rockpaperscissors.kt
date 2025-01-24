package games

import enums.MOVES
import enums.RESULTS
import strategies.ScoreCalculationStrategy
import strategies.NormalCalculationStrategy
import players.Player

class RockPaperScissors(val scoreCalculationStrategy : ScoreCalculationStrategy, val firstPlayer : Player, val secondPlayer : Player) {
    fun start(rounds : Int) {
        repeat(rounds) {
            val firstPlayerMove : MOVES = firstPlayer.play()
            val secondPlayerMove : MOVES = secondPlayer.play()
            val firstPlayerResult : RESULTS = scoreCalculationStrategy.calculate(firstPlayerMove, secondPlayerMove)
            val secondPlayerResult : RESULTS = scoreCalculationStrategy.calculate(secondPlayerMove, firstPlayerMove)
            firstPlayer.updateState(firstPlayerResult)
            secondPlayer.updateState(secondPlayerResult)
        }
        
    }
}