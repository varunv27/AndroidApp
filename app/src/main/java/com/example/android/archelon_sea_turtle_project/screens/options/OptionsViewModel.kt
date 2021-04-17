package com.example.android.archelon_sea_turtle_project.screens.options

import android.util.Log
import androidx.lifecycle.ViewModel

class OptionsViewModel(token: String) : ViewModel() {

    var token = token

    override fun onCleared() {
        super.onCleared()
        Log.i("OptionsFragment", "OptionsFragment destroyed!")
    }




}