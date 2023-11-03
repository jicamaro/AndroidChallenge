package cl.accenture.android.challenge.presentation.model

sealed class FormUiState {

    object Loading: FormUiState()
    data class FormError(val errorMessage: String): FormUiState()
    data class Form(
        val name: String,
        val lastName: String,
        val city: String,
        val phone: String,
        val commune: String
    ): FormUiState()

    object FormCompleted: FormUiState()
}