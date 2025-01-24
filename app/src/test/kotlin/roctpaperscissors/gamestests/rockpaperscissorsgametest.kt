package gamestests

import enums.MOVES
import players.Player
import games.RockPaperScissors
import strategies.PlayStrategy
import strategies.RandomMoveStrategy
import strategies.ConstantMoveStrategy
import strategies.ScoreCalculationStrategy
import strategies.NormalCalculationStrategy
import scoreboards.Scoreboard
import strategies.NormalDisplayScoreStrategy
import kotlin.test.Test
import kotlin.test.assertEquals


class RockPaperScissorsTest {
    @Test fun `simulateGame updates stats correctly`() {
        val playerA : Player = Player("FirstA", RandomMoveStrategy())
        val playerB : Player = Player("FirstB", ConstantMoveStrategy(MOVES.ROCK))
        val game : RockPaperScissors = RockPaperScissors(NormalCalculationStrategy(), playerA, playerB)
        val rounds = 100
        game.start(rounds)
        val totalGames = playerA.wins + playerA.loses + playerA.draws
        assertEquals(100, totalGames)
        assertEquals(playerA.draws, playerB.draws) // Draw count should match
        assertEquals(playerA.wins, playerB.loses) // First player's losses are second player's wins
    }
}