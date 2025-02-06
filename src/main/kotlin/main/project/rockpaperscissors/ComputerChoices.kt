package main.projects.rockpaperscissors

fun computerChoice(): String {
    val choices = listOf("Rock", "Paper", "Scissors")
    return choices.random()
}