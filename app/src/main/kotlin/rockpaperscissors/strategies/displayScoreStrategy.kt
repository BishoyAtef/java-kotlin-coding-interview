package strategies

import players.Player
import players.Player.PlayerInfoCard

abstract class DisplayScoreStrategy() {
    abstract fun display(firstPlayerInfoCard : PlayerInfoCard, secondPlayerInfoCard : PlayerInfoCard)
}