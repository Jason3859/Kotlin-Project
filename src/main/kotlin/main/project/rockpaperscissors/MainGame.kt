package org.example.main.project.rockpaperscissors

import main.project.rockpaperscissors.computerPoints
import main.project.rockpaperscissors.game
import main.project.rockpaperscissors.playerPoints

fun rockPaperScissors() {
    var rounds = 0

    println("Welcome to Rock, Paper, Scissors!")

    while (playerPoints < 3 || computerPoints < 3) {
        rounds++
        println("Round $rounds:")
        game()
        println()

        if (playerPoints == 3) {
            break
        }

        if (computerPoints == 3) {
            break
        }
    }

    println("Game Over!")
    println("Final Score -> You: $playerPoints, Computer: $computerPoints")

    println(
        when {
            playerPoints > computerPoints -> "Congratulations, You won the game!"
            playerPoints < computerPoints -> "Better luck next time. I won"
            else -> "Tie"
        }
    )
}