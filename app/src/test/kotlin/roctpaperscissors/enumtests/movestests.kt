package enumtests

import enums.MOVES
import kotlin.test.Test
import kotlin.test.assertEquals

class MOVESTest {
    @Test fun `enum Move should have ROCK, PAPER, and SCISSORS`() {
        val moves : Array<MOVES> = MOVES.values()
        assertEquals(moves.size, 3)
        assertEquals(MOVES.ROCK, moves[0])
        assertEquals(MOVES.PAPER, moves[1])
        assertEquals(MOVES.SCISSOR, moves[2])
    }
}