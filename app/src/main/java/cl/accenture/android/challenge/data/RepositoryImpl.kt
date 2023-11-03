package cl.accenture.android.challenge.data

import cl.accenture.android.challenge.data.model.FormRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class RepositoryImpl {
    suspend fun getForm(request: FormRequest) {
        withContext(Dispatchers.IO) {
            delay(3000L)

        }
    }


}