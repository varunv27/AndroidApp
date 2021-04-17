package com.example.android.archelon_sea_turtle_project.screens.login


import com.squareup.moshi.Json


data class LoginTokenData(
        // Holding class to hold user credential data
        @field:Json(name = "key") var key: String
)