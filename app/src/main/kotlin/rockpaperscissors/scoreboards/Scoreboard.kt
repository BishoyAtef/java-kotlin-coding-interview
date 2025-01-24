package scoreboards

import strategies.DisplayScoreStrategy
import strategies.NormalDisplayScoreStrategy
import players.Player
import players.Player.PlayerInfoCard

class Scoreboard constructor(val displayScoreStrategy : DisplayScoreStrategy) {
    fun show(firstPlayerInfoCard : PlayerInfoCard, secondPlayerInfoCard : PlayerInfoCard) {
        displayScoreStrategy.display(firstPlayerInfoCard, secondPlayerInfoCard)
    }
}