package com.example.android.archelon_sea_turtle_project.screens.login

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import okhttp3.MultipartBody


class LoginViewModel : ViewModel() {

    var token = ""
    var authCheck = "not_completed"
    private var viewModelJob = Job()
    // Define coroutine scope to be used for API call
    val coroutineScope = CoroutineScope(
            viewModelJob + Dispatchers.Default )

    init {
        Log.i("LoginViewModel", "LoginViewModel created!")

    }

    fun checkUserCredentials(username: String, password: String) {
        // Create REST API request to validate user credentials
        authCheck = "in_progress"
        val requestBody = MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("username", username)
                .addFormDataPart("password", password)
                .build()

        // Launch REST request on different thread
        coroutineScope.launch {
             var getPropertiesDeferred = LoginApi.retrofitService.authenticateUser(requestBody)

            try {
                var listResult = getPropertiesDeferred.await()

                token = listResult.key
                authCheck = "complete"
                Log.i("token","token:" + token)


            } catch (e: Exception) {
                var response = "Failure: ${e.message}"
                authCheck = "incomplete"
                Log.e("Auth Check" , response)
            }

        }

    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }


}

