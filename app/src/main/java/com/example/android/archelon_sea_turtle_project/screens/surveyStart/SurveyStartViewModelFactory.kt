package com.example.android.archelon_sea_turtle_project.screens.surveyStart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SurveyStartViewModelFactory(private val token: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SurveyStartViewModel::class.java)) {
            return SurveyStartViewModel(token) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}
