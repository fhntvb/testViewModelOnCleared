package com.imagine.testviewmodeloncleared

import com.imagine.testviewmodeloncleared.ui.main.MainViewModel
import com.imagine.testviewmodeloncleared.ui.main.SecondViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MainViewModel() }
    viewModel { SecondViewModel() }
}