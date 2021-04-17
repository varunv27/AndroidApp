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

package com.example.android.archelon_sea_turtle_project.screens.options


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.NavHostFragment
import com.example.android.archelon_sea_turtle_project.R
import com.example.android.archelon_sea_turtle_project.databinding.OptionsFragmentBinding



class OptionsFragment : Fragment() {

    private lateinit var viewModel: OptionsViewModel
    private lateinit var viewModelFactory: OptionsViewModelFactory
    private lateinit var binding: OptionsFragmentBinding
    private lateinit var myToast: Toast


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.options_fragment,
                container,
                false
        )
        // Define Toast to show non implemented buttons

        myToast = Toast.makeText(context, " Not yet implemented", Toast.LENGTH_LONG)

        // Setup button on click listeners
        Log.i("OptionsFragment", "Called ViewModelProviders ")
        viewModelFactory = OptionsViewModelFactory(OptionsFragmentArgs.fromBundle(arguments!!).token)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(OptionsViewModel::class.java)
        binding.nestCheckButton.setOnClickListener { nestCheck() }
        binding.startSurveyButton.setOnClickListener { startSurvey() }
        binding.emergencyRelocationButton.setOnClickListener { emergencyRelocation() }
        binding.startExcavationButton.setOnClickListener { startExcavation() }

        return binding.root

    }


    /** Methods for buttons presses **/

    private fun startSurvey() {

        // Start  new survey and pass token to next fragment

        val action = OptionsFragmentDirections.startSurvey()
        action.token = viewModel.token
        NavHostFragment.findNavController(this).navigate(action)
    }

    private fun nestCheck() {
        myToast.show()
    }

    private fun startExcavation() {
        myToast.show()
    }

    private fun emergencyRelocation() {

        myToast.show()
    }



}
