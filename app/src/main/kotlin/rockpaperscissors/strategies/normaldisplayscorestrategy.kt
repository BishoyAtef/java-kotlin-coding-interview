package strategies

import players.Player
import players.Player.PlayerInfoCard

class NormalDisplayScoreStrategy() : DisplayScoreStrategy() {
    override fun display(firstPlayerInfoCard : PlayerInfoCard, secondPlayerInfoCard : PlayerInfoCard) {
        val totalGames = firstPlayerInfoCard.wins + firstPlayerInfoCard.loses + firstPlayerInfoCard.draws // total number of games played
        println("${firstPlayerInfoCard.name} wins ${firstPlayerInfoCard.wins} of $totalGames games")
        println("${secondPlayerInfoCard.name} wins ${secondPlayerInfoCard.wins} of $totalGames games")
        println("Draws: ${firstPlayerInfoCard.draws} of $totalGames games")
    }
}