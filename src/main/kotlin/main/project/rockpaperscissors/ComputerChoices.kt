package main.project.rockpaperscissors

fun computerChoice(): String {
    val choices = listOf("Rock", "Paper", "Scissors")
    return choices.random()
}