package main.project.cricket

import org.example.main.project.cricket.GameVariables
import org.example.main.project.cricket.computerChoices

class Player {

    class first : Game {
        override fun batting() {
            val game = GameVariables()

            var rounds = 0
            var out = false

            do {
                print("Enter any number: ")
                game.playerNumber = readln().toInt()
                game.computerNumber = computerChoices()
                println(game.computerNumber)

                if (game.playerNumber != game.computerNumber) {
                    game.playerScore += game.playerNumber
                    println("Your Score: ${game.playerScore}")
                    rounds++
                    continue
                } else if (game.playerNumber == game.computerNumber) {
                    out = true
                    println("You are out")
                    println("Your score: ${game.playerScore}")
                    println("You played $rounds balls")
                }
            } while (!out)
        }

        override fun balling() {
            val game = GameVariables()

            var rounds = 0
            var out = false

            do {
                print("Enter any number: ")
                game.playerNumber = readln().toInt()
                game.computerNumber = computerChoices()
                println(computerChoices())

                if (game.computerNumber != game.playerNumber) {
                    game.computerScore += game.computerNumber
                    println("My score: ${game.computerScore}")
                    rounds++
                    continue
                } else if (game.computerNumber == game.playerNumber) {
                    out = false
                    println("I am out")
                    println("My score: ${game.computerScore}")
                    println("i played $rounds balls")
                }
            } while (!out)
        }
    }
}