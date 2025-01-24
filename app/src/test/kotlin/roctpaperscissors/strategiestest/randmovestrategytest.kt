package strategiestests

import enums.MOVES
import strategies.RandomMoveStrategy
import strategies.PlayStrategy
import kotlin.test.Test
import kotlin.test.assertTrue

class RandMoveStrategyTest {
    @Test fun `Random move strategy should output valid random moves`() {
        val randMoveStrategy : PlayStrategy = RandomMoveStrategy()
        repeat(10) {
            assertTrue(randMoveStrategy.start() in MOVES.values())
        }
    }
}

