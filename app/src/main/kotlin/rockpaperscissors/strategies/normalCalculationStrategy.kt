package strategies

import enums.MOVES
import enums.RESULTS

class NormalCalculationStrategy() : ScoreCalculationStrategy() {
    // results are calculated with respect to first play so result is win then first play has won simillary for lose
    override fun calculate(firstPlayerMove : MOVES, secondPlayerMove : MOVES) : RESULTS {
        return when {
            firstPlayerMove == secondPlayerMove -> RESULTS.DRAW
            (firstPlayerMove == MOVES.ROCK && secondPlayerMove == MOVES.SCISSOR) ||
            (firstPlayerMove == MOVES.SCISSOR && secondPlayerMove == MOVES.PAPER) ||
            (firstPlayerMove == MOVES.PAPER && secondPlayerMove == MOVES.ROCK) -> RESULTS.WIN
            else -> RESULTS.LOSE
        }
    }
}