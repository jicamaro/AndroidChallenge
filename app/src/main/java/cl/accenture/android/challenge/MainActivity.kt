package cl.accenture.android.challenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cl.accenture.android.challenge.presentation.FormScreen
import cl.accenture.android.challenge.presentation.form.FormViewModel
import cl.accenture.android.challenge.ui.theme.AndroidChallengeTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            AndroidChallengeTheme {

                val topBarState by remember { mutableStateOf("") }

                Scaffold(
                    topBar = {
                        TopAppBar(title = { topBarState })
                    }
                ) {
                    Column(
                        modifier = Modifier
                            .padding(it)
                            .background(color = MaterialTheme.colorScheme.background)
                            .fillMaxSize()
                    ) {
                        NavHost(
                            navController = rememberNavController(),
                            startDestination = "form"
                        ) {

                            composable(
                                "form"
                            ) {
                                FormScreen(
                                    viewModel = FormViewModel(),
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}