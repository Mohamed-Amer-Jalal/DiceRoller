package com.example.diceroller.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DiceViewModel : ViewModel() {
    // MutableStateFlow to hold the DiceUiState
    private val _uiState = MutableStateFlow(DiceUiState())
    val uiState: StateFlow<DiceUiState> = _uiState.asStateFlow()

    // Function to roll the dice and update the state
    fun rollDice() {
        _uiState.value = _uiState.value.copy(diceRollResult = (1..6).random())
    }
}
