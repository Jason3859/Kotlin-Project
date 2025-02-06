package org.example

import java.util.Scanner
import org.example.main.project.calculator.calculator
import org.example.main.projects.rockpaperscissors.rockPaperScissors

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter 1 for Rock Paper Scissors and 2 for calculator")
    val number = scanner.nextInt()

    when (number) {
        1 -> calculator()
        2 -> rockPaperScissors()
    }
}