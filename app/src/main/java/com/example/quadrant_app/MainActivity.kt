package com.example.quadrant_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant_app.ui.theme.Quadrant_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quadrant_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    QuadrantApp()

                }
            }
        }
    }
}


@Composable
fun QuadrantApp() {
    Column(Modifier.fillMaxWidth()){
    Row(Modifier.weight(1f)) {

        CardItem(
            title = stringResource(R.string.first_heading),
            mainText = stringResource(R.string.first_text),
            backgroundColor = Color(0xFFEADDFF),
            modifier = Modifier
                .padding(16.dp)
                .weight(1f),
        )

        CardItem(
            title = stringResource(R.string.second_heading),
            mainText = stringResource(R.string.second_text),
            backgroundColor = Color(0xFFD0BCFF),
            modifier = Modifier
                .padding(16.dp)
                .weight(1f),
        )

    }
        Row(Modifier.weight(1f)) {

            CardItem(
                title = stringResource(R.string.third_heading),
                mainText = stringResource(R.string.third_text),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f),
            )

            CardItem(
                title = stringResource(R.string.fourth_heading),
                mainText = stringResource(R.string.fourth_text),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f),
            )

        }
    }

}

@Composable
fun CardItem(title: String, mainText: String, backgroundColor: Color, modifier: Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(backgroundColor)
            .fillMaxSize()){

        Text(
            text = title,
            fontWeight= FontWeight.Bold,
            modifier = Modifier.padding(16.dp),

        )

        Text(
            text= mainText,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Quadrant_appTheme {
        QuadrantApp()
    }
}