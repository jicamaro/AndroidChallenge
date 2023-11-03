package cl.accenture.android.challenge.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import cl.accenture.android.challenge.presentation.form.FormViewModel
import cl.accenture.android.challenge.presentation.model.FormUiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormScreen(viewModel: FormViewModel, onTopBarChanged: (String) -> Unit = { _ -> }) {

    val state by viewModel.uiState.collectAsState()

    var name by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var commune by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {

    }

    when (state) {
        is FormUiState.Loading -> {
            Column {

            }
        }
        is FormUiState.FormError -> {
            onTopBarChanged("")
            Column {

            }
        }
        else -> {
            onTopBarChanged("")
            Column {
                Text(text = "")
                OutlinedTextField(value = name, onValueChange = {
                    name = it
                })
                Text(text = "")
                OutlinedTextField(value = lastName, onValueChange = {
                    lastName = it
                })
                Text(text = "")
                OutlinedTextField(value = city, onValueChange = {
                    city = it
                })
                Text(text = "")
                OutlinedTextField(value = phone, onValueChange = {
                    phone = it
                })
                Text(text = "")
                OutlinedTextField(value = commune, onValueChange = {
                    commune = it
                })
                Button(onClick = {
                    viewModel.submit(

                    )
                }) {

                }
            }
        }
    }
}