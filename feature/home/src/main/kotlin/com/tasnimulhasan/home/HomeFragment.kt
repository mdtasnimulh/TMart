package com.tasnimulhasan.home

import android.os.Bundle
import com.tasnimulhasan.common.base.BaseFragment
import com.tasnimulhasan.home.databinding.FragmentHomeBinding
import com.tasnimulhasan.sharedpref.SharedPrefHelper
import com.tasnimulhasan.ui.ErrorUiHandler
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    private lateinit var errorHandler: ErrorUiHandler
    @Inject
    lateinit var sharedPrefHelper: SharedPrefHelper

    override fun viewBindingLayout(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun initializeView(savedInstanceState: Bundle?) {
        errorHandler = ErrorUiHandler(binding.errorUi, binding.featureUi)
    }
}