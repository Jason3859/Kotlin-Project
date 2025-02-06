package main.projects.rockpaperscissors

var playerPoints = 0
var computerPoints = 0

fun points(player: String, computer: String) {
    println("Computer chose: $computer")

    if (player == computer) {
        println("It's a tie!")
    }

    else if (
        (player == "rock" && computer == "scissors") ||
        (player == "paper" && computer == "rock") ||
        (player == "scissors" && computer == "paper")
    ) {
        playerPoints++
        println("You won this round!")
    }

    else if (
        (player == "scissors" && computer == "rock") ||
        (player == "rock" && computer == "paper") ||
        (player == "paper" && computer == "scissors")
    ) {
        computerPoints++
        println("I won this round!")
    }

    else {
        println("Invalid choice! Please enter rock, paper, or scissors.")
    }

    println("Current Score -> You: $playerPoints, Computer: $computerPoints")
}
