package strategiestests

import enums.MOVES
import strategies.ConstantMoveStrategy
import strategies.PlayStrategy
import kotlin.test.Test
import kotlin.test.assertEquals

class ConstMoveStrategyTest {
    @Test fun `Constant move strategy should output the same move always`() {
        val constMoveStrategy : PlayStrategy = ConstantMoveStrategy(MOVES.PAPER)
        repeat(10) {
            assertEquals(constMoveStrategy.start(), MOVES.PAPER)
        }
    }
}