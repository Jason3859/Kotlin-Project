package org.example.main.project.cricket

data class GameVariables(
    var gameChoice: String? = null,
    var playerScore: Int = 0,
    var computerScore: Int = 0,
    var playerNumber: Int = 0,
    var computerNumber: Int = 0,
    var afterOut: Boolean? = null,
    var isFirstChance: Boolean? = null,
    var isSecondChance: Boolean? = null
)