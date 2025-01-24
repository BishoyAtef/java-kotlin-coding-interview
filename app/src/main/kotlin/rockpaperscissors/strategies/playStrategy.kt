package strategies

import enums.MOVES

abstract class PlayStrategy() {
    abstract fun start():  MOVES
}

