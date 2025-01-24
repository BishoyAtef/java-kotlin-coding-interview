package strategies

import enums.MOVES

class ConstantMoveStrategy constructor(val constMove : MOVES) : PlayStrategy() {
    override fun start() : MOVES {
        val moves: Array<MOVES> = MOVES.values()
        return moves[constMove.ordinal]
    }
}