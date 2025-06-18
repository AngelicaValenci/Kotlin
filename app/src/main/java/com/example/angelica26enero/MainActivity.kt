package com.example.angelica26enero

import com.example.angelica26enero.ScreenScaffold.pantallaScaffold
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.angelica26enero.ui.theme.Angelica26EneroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            pantallaScaffold()

        }
    }
}

@Preview()
@Composable
fun GreetingPreview() {
    Angelica26EneroTheme{

    }
     pantallaScaffold()

    }
