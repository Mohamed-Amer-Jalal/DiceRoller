package com.example.diceroller.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.diceroller.R
import com.example.diceroller.ui.theme.DiceRollerTheme

@Composable
fun DiceRollerApp() {
    Scaffold(
        topBar = { TopBar() },
        containerColor = MaterialTheme.colorScheme.background
    ) { innerPadding ->
        DiceWithButtonAndImage(modifier = Modifier.padding(innerPadding))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    CenterAlignedTopAppBar(
        title = { Text(text = "Dice Roller", fontWeight = FontWeight.Bold) },
        colors = TopAppBarDefaults.largeTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        ), modifier = Modifier
    )
}

@Composable
fun DiceWithButtonAndImage(
    modifier: Modifier = Modifier,
    viewModel: DiceViewModel = DiceViewModel()
) {
    // Collect the UI state from the ViewModel
    val uiState by viewModel.uiState.collectAsState()

    val imageResource = when (uiState.diceRollResult) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.padding_default))
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imageResource),
            contentDescription = uiState.diceRollResult.toString()
        )
        Spacer(modifier = modifier.height(dimensionResource(R.dimen.padding_default)))
        Button(
            onClick = { viewModel.rollDice() },
            colors = ButtonDefaults.buttonColors(Color(0xFFE2D3E4))
        ) {
            Text(
                text = stringResource(R.string.roll),
                fontSize = dimensionResource(R.dimen.text_size_large).value.sp
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DiceRollerDarkModePreview() {
    DiceRollerTheme(darkTheme = true) {
        DiceRollerApp()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DiceRollerWhiteModePreview() {
    DiceRollerTheme(darkTheme = false) {
        DiceRollerApp()
    }
}