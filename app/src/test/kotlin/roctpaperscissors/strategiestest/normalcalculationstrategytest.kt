package strategiestests

import enums.MOVES
import enums.RESULTS
import strategies.ScoreCalculationStrategy
import strategies.NormalCalculationStrategy
import kotlin.test.Test
import kotlin.test.assertEquals

class NormalCalculationStrategy {
    @Test fun `Normal score calculation should report win if first play won a round of the game and lose if first player loses and draw other`() {
        val test : ScoreCalculationStrategy = NormalCalculationStrategy()
        assertEquals(test.calculate(MOVES.ROCK, MOVES.SCISSOR), RESULTS.WIN)
        assertEquals(test.calculate(MOVES.SCISSOR, MOVES.PAPER), RESULTS.WIN)
        assertEquals(test.calculate(MOVES.PAPER, MOVES.ROCK), RESULTS.WIN)
        assertEquals(test.calculate(MOVES.ROCK, MOVES.PAPER), RESULTS.LOSE)
        assertEquals(test.calculate(MOVES.SCISSOR, MOVES.ROCK), RESULTS.LOSE)
        assertEquals(test.calculate(MOVES.PAPER, MOVES.SCISSOR), RESULTS.LOSE)
        assertEquals(test.calculate(MOVES.SCISSOR, MOVES.SCISSOR), RESULTS.DRAW)
        assertEquals(test.calculate(MOVES.ROCK, MOVES.ROCK), RESULTS.DRAW)
    }
}