package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composearticle.ui.theme.ComposeArticleTheme

// Main Activity to główna funkcja rozpoczynajaca działanie programu, w innych przyapdkach main(), przy Swift'cie ContentView
class MainActivity : ComponentActivity() {
    // nadpisanie funkcji onCreate - podstawowy cykl życia aktywności w Androidzie
    override fun onCreate(savedInstanceState: Bundle?) {
        // Wywołanie funkcji onCreate, potrzebne do prawidłowego działnia funkcji
        super.onCreate(savedInstanceState)
        // Funkcja sprawiająca że pasek Nawigacji robi się przeźroczysty
        enableEdgeToEdge()
        // ustawienie
        setContent {
            ComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// adnotacja @Composable oznacza że funkcja będzie używana przez Jetpack COmpose do wygenerowania UI
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Red) {
        Text(
            text = "Hello $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        Greeting("Android")
    }
}