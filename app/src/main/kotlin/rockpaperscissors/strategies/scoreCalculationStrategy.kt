package strategies

import enums.MOVES
import enums.RESULTS

abstract class ScoreCalculationStrategy() {
    // results are calculated with respect to first play so result is win then first play has won simillary for lose
    abstract fun calculate(fistPlayerMove : MOVES, secondPlayerMove : MOVES) : RESULTS 
}