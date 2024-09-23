package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diceroller.ui.theme.DiceRollerTheme
import com.example.diceroller.ui.theme.vactor.diceFive
import com.example.diceroller.ui.theme.vactor.diceFour
import com.example.diceroller.ui.theme.vactor.diceOne
import com.example.diceroller.ui.theme.vactor.diceSix
import com.example.diceroller.ui.theme.vactor.diceThere
import com.example.diceroller.ui.theme.vactor.diceTwo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiceRollerTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color.DarkGray
                ) { innerPadding ->
                    DiceWithButtonAndImage(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun DiceWithButtonAndImage(
    modifier: Modifier = Modifier
) {
    var result by remember { mutableIntStateOf(1) }
    val imageResource = when (result) {
        1 -> diceOne()
        2 -> diceTwo()
        3 -> diceThere()
        4 -> diceFour()
        5 -> diceFive()
        else -> diceSix()
    }
    Column(
        modifier = modifier
            .background(color = Color.DarkGray)
            .fillMaxSize()
            .padding(16.dp)
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = imageResource,
            contentDescription = result.toString()
        )
        Spacer(modifier = modifier.height(16.dp))
        Button(
            onClick = { result = (1..6).random() },
        ) {
            Text(text = "Roll", fontSize = 24.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DiceRollerPreview() {
    DiceRollerTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = Color.DarkGray
        ) { innerPadding ->
            DiceWithButtonAndImage(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}