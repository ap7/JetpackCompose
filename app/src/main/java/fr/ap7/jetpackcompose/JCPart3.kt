package fr.ap7.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.ap7.jetpackcompose.ui.theme.JetpackComposeTheme
import fr.ap7.jetpackcompose.ui.theme.Purple200

val data = listOf("Maryline", "Arhouston", "Joshua", "Elyana")

class JCPart3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            /***
             * learn about modifiers and how we can use them to modify composables.
             */
            Surface(color = MaterialTheme.colors.background) {
                ClickView(value = data)
            }
        }
    }
}

@Composable
fun JCP3View(value: List<String>) {
    Column(
        modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .background(Purple200)
            .border(5.dp, Color.DarkGray)
            .padding(5.dp)
            .border(5.dp, Color.Blue)
            .padding(5.dp)
            .border(5.dp, Color.Red)
            .padding(10.dp)
        // .width(300.dp)
        // .requiredWidth(300.dp), // Force the width to be exactly as wide as we specify
    ) {
        for (i in value.indices) {
            Text(
                text = value[i],
                modifier = Modifier
                    .border(5.dp, Color.Cyan)
                    .padding(5.dp)
                    .offset(50.dp, 20.dp)
                    .border(5.dp, Color.White)
                    .padding(10.dp)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Text("world", modifier = Modifier.offset(100.dp))
    }
}

@Composable
fun ClickView(value: List<String>) {
    Column(
        modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .background(Purple200)
            .border(5.dp, Color.DarkGray)
            .padding(5.dp)
            .border(5.dp, Color.Blue)
            .padding(5.dp)
            .border(5.dp, Color.Red)
            .padding(10.dp)
        // .width(300.dp)
        // .requiredWidth(300.dp), // Force the width to be exactly as wide as we specify
    ) {
        for (i in value.indices) {
            Text(
                text = value[i],
                modifier = Modifier
                    .border(5.dp, Color.Cyan)
                    .padding(5.dp)
                    .offset(50.dp, 20.dp)
                    .border(5.dp, Color.White)
                    .padding(10.dp)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            "world",
            modifier = Modifier
                .offset(100.dp)
                .clickable { }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun JCP3Preview() = JetpackComposeTheme {
    ClickView(value = data)
}
