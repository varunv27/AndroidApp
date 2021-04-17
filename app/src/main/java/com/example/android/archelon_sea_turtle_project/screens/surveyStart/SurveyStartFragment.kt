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

package com.example.android.archelon_sea_turtle_project.screens.surveyStart

import android.location.Location
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.NavHostFragment
import com.example.android.archelon_sea_turtle_project.R
import com.example.android.archelon_sea_turtle_project.databinding.SurveyStartFragmentBinding
import java.text.SimpleDateFormat
import java.util.*

class SurveyStartFragment : Fragment() {

    private lateinit var viewModel: SurveyStartViewModel
    private lateinit var viewModelFactory: SurveyStartViewModelFactory
    private lateinit var binding : SurveyStartFragmentBinding


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        // Inflate view and obtain an instance of the binding class.
         binding = DataBindingUtil.inflate(
                 inflater,
                 R.layout.survey_start_fragment,
                 container,
                 false
         )

        // Setup button listeners
        viewModelFactory = SurveyStartViewModelFactory(SurveyStartFragmentArgs.fromBundle(arguments!!).token)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(SurveyStartViewModel::class.java)
        binding.BackButton.setOnClickListener { backButtonPressed() }
        binding.NextButton.setOnClickListener { nextButtonPressed() }

        //load Room Database in viewModel for persistence
        context?.let { viewModel.loadDb(it) }

        //load fused location provider in viewModel for persistence
        context?.let { viewModel.loadLocationProvider(it) }
        return binding.root
    }

    private fun backButtonPressed() {
        // On back button press go to previous screen based on main_navigation.xml

        val action = SurveyStartFragmentDirections.backToOptionsPage()
        NavHostFragment.findNavController(this).navigate(action)
    }

    private fun nextButtonPressed() {

        // Collect form Data

        viewModel.newSurvey.area = binding.AreaText.text.toString()

        //Setup Calendar to coolect date selected from date Picker

        val day: Int = binding.datePicker.getDayOfMonth()
        val month: Int = binding.datePicker.getMonth()
        val year: Int = binding.datePicker.getYear()
        val calendar: Calendar = Calendar.getInstance()
        calendar.set(year, month, day)
        val sdf = SimpleDateFormat("dd-MM-yyyy")
        val formatedDate: String = sdf.format(calendar.getTime())
        viewModel.newSurvey.date = formatedDate
        viewModel.newSurvey.beach = binding.BeachText.text.toString()
        viewModel.newSurvey.sector = binding.SectorText.text.toString()
        viewModel.newSurvey.subsector = binding.SubSectorText.text.toString()
        viewModel.newSurvey.emergence_event = binding.EmergenceEventText.text.toString()
        var nest: String = binding.NestText.text.toString()
        viewModel.newSurvey.nest = nest
        binding.DistancetoSeaText.toString()
        viewModel.newSurvey.distance_to_sea = binding.DistancetoSeaText.toString()
        viewModel.newSurvey.track_type = binding.TrackTypeText.text.toString()
        viewModel.newSurvey.non_nesting_attempts = binding.NonNestingAttemptsText.text.toString()
        viewModel.newSurvey.tags = binding.tagsText.text.toString()
        viewModel.newSurvey.comments = binding.CommentsText.text.toString()
        viewModel.newSurvey.photo_id = binding.photoIDText.text.toString()

        // Get location from fusded location provider for survey location

        viewModel.fusedLocationClient?.lastLocation
                ?.addOnSuccessListener { location : Location? ->
                    if (location != null) {
                        viewModel.newSurvey.gps_latitude = location.latitude.toString()
                        viewModel.newSurvey.gps_longitude = location.longitude.toString()
                    }
                }

        // Add form data collected to DB

        viewModel.loadDataIntoDB()

        //Navigate back to start page
        val action = SurveyStartFragmentDirections.backToOptionsPage()
        action.token = viewModel.token
        NavHostFragment.findNavController(this).navigate(action)
    }
}
