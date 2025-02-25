package org.example

import java.util.Scanner
import org.example.main.project.calculator.calculator
import org.example.main.project.rockpaperscissors.rockPaperScissors

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter 1 for Rock Paper Scissors and 2 for calculator: ")
    val number = scanner.nextInt()

    when (number) {
        1 -> rockPaperScissors()
        2 -> calculator()
    }
}