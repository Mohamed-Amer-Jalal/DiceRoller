package com.example.diceroller.ui

data class DiceUiState(val diceRollResult: Int = (1..6).random())