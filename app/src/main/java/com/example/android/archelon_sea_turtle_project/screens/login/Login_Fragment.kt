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

package com.example.android.archelon_sea_turtle_project.screens.login

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.android.archelon_sea_turtle_project.R
import com.example.android.archelon_sea_turtle_project.databinding.LoginFragmentBinding
import kotlinx.coroutines.isActive
import kotlinx.coroutines.job


/**
 * Fragment for the starting or title screen of the app
 */
class Login_Fragment : Fragment() {
    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: LoginFragmentBinding = DataBindingUtil.inflate(
                inflater, R.layout.login_fragment, container, false)

        val navController = findNavController()
        Log.i("LoginFragment", "Called ViewModelProviders")
        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        binding.loginButton.setOnClickListener {

            val username_login = binding.usernameText.text;
            val password_login = binding.passwordText.text;


            // Authenticate User based on credentials entered
            viewModel.checkUserCredentials(username_login.toString(),password_login.toString())
            while( viewModel.authCheck == "not_complete" || viewModel.authCheck == "in_progress") { }

            if (viewModel.authCheck == "complete") {

                // Pass recieved  authenticated token to next fragment
                val action = Login_FragmentDirections.surveyOptions()
                action.token = viewModel.token
                navController.navigate(action)
                viewModel.authCheck = "not_complete"

            } else {
                binding.usernameText.setTextColor(Color.rgb(255, 0, 0))
                binding.passwordText.setTextColor(Color.rgb(255, 0, 0))
                viewModel.authCheck = "not_complete"

            }

        }
        return binding.root
    }
}


