package strategies

import enums.MOVES
import kotlin.random.Random

class RandomMoveStrategy() : PlayStrategy() {
    override fun start() : MOVES{
        val moves: Array<MOVES> = MOVES.values()
        return moves[Random.nextInt(moves.size)]
    }
}
