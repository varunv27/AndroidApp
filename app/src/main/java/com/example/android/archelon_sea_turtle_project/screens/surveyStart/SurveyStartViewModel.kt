package com.example.android.archelon_sea_turtle_project.screens.surveyStart

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.example.android.archelon_sea_turtle_project.MainActivity
import com.example.android.archelon_sea_turtle_project.database.MorningSurvey
import com.example.android.archelon_sea_turtle_project.database.MorningSurveyDatabase
import com.example.android.archelon_sea_turtle_project.database.MorningSurveyDatabaseDAO
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class SurveyStartViewModel(token: String) : ViewModel() {

    // Instantiate required objects / classes

    var token = token
    var newSurvey = MorningSurvey()
    var db: MorningSurveyDatabase? = null
    var morningDao: MorningSurveyDatabaseDAO? = null
    var fusedLocationClient: FusedLocationProviderClient? = null

    private var viewModelJob = Job()

    val coroutineScope = CoroutineScope(
            viewModelJob + Dispatchers.Default )

    // Create DB instance if it does not already exist

    fun loadDb( context: Context) {
        if (db == null) {
        db = Room.databaseBuilder(context,MorningSurveyDatabase::class.java,"Morning_Survey_DB")
                .build()
        }
        morningDao = db!!.MorningSurveyDatabaseDAO

    }

    // Get latest available location to be recorded for survey

    fun loadLocationProvider(context: Context) {
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(context)
    }

    // Load data into DB via coroutine

    fun loadDataIntoDB() {
        coroutineScope.launch {
            morningDao?.insert(newSurvey)
            Log.i("DB","==> Loaded data into DB")
        }

    }

    override fun onCleared() {
        super.onCleared()
        Log.i("SurveyStart", "SurveyStartFragment destroyed!")
    }


}