package fr.ap7.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.ap7.jetpackcompose.ui.theme.JetpackComposeTheme
import fr.ap7.jetpackcompose.ui.theme.Purple500

val data2 = listOf("Hello", "World", "Hello")

class JCPart2 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /**
             *  learn about the ROW and COLUMN composable and how we can use modifiers to size our composables.
             */
            View1(value = data2)
        }
    }
}

@Composable
fun View1(value: List<String>) {
    Row(
        modifier = Modifier
            // .width(300.dp)
            .fillMaxSize()
            .background(Purple500),
        horizontalArrangement = Arrangement.SpaceEvenly,
        // verticalAlignment = Alignment.Top
        // verticalAlignment = Alignment.Bottom
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in value.indices) {
            Text(text = value[i])
        }
    }
}

@Composable
fun View2(value: List<String>) {
    Column(
        modifier = Modifier
            .fillMaxSize() // fill all the space
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        for (i in value.indices) {
            Text(text = value[i])
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JCP2Preview() {
    JetpackComposeTheme {
        View1(data2)
    }
}
