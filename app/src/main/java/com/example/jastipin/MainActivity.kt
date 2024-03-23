package com.example.jastipin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jastipin.navigation.Navigation
import com.example.jastipin.ui.theme.JastipinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JastipinTheme {
                // tambahkan file navigation yang nav controller nya sudah kita atur
                Navigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Previews() {
    Navigation()
}
