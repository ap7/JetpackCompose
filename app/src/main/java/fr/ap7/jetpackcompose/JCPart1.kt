package fr.ap7.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class JCPart1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting1(name = "Arhouston")
        }
    }
}

@Composable
fun Greeting1(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = false)
@Composable
fun JCP1Preview1() {
    Greeting1("Arhouston7")
}