package main.projects.rockpaperscissors

fun game() {
    println("Rock, Paper, Scissors? (Type your choice)")
    val playerChoice = readln().lowercase()
    val computerChoice = computerChoice().lowercase()

    points(playerChoice, computerChoice)
}