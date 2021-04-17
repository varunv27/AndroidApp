/*
 * Copyright (C) 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.archelon_sea_turtle_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.android.archelon_sea_turtle_project.database.MorningSurveyDatabase
import com.example.android.archelon_sea_turtle_project.database.MorningSurveyDatabaseDAO
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

/**
 * Creates an Activity that hosts all of the fragments in the app
 */
class MainActivity : AppCompatActivity() {
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var db: MorningSurveyDatabase
    private lateinit var morningDao: MorningSurveyDatabaseDAO
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        db = Room.inMemoryDatabaseBuilder(this, MorningSurveyDatabase::class.java)
                // Allowing main thread queries, just for testing.
                .allowMainThreadQueries()
                .build()
        morningDao = db.MorningSurveyDatabaseDAO
    }

}
