package org.example.main.project.rockpaperscissors

fun rockPaperScissors() {
    println("Welcome to Rock, Paper, Scissors!")
    for (rounds in 1..3) {
        println("Round $rounds:")
        game()
        println()
    }
    println("Game Over!")
    println("Final Score -> You: $playerPoints, Computer: $computerPoints")

    if (playerPoints > computerPoints) {
        println("Congratulations, you won the game!")
    } else if (playerPoints < computerPoints) {
        println("I won the game! Better luck next time.")
    } else {
        println("It's a tie!")
    }
}