package cl.accenture.android.challenge.presentation.form

import androidx.lifecycle.ViewModel
import cl.accenture.android.challenge.presentation.model.FormUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class FormViewModel: ViewModel() {

    private val _uiState: MutableStateFlow<FormUiState> = MutableStateFlow(FormUiState.Loading)
    val uiState: StateFlow<FormUiState>
        get() = _uiState


    fun submit() {

    }
}