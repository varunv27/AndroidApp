package com.example.android.archelon_sea_turtle_project.screens.options

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class OptionsViewModelFactory(private val token: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(OptionsViewModel::class.java)) {
            return OptionsViewModel(token) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}
