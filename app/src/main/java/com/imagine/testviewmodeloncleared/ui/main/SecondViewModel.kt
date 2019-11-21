package com.imagine.testviewmodeloncleared.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel

class SecondViewModel : ViewModel() {

    init {
        Log.i("TestViewModel","init ViewModel")
    }

    override fun onCleared() {
        Log.i("TestViewModel","onCleared")
        super.onCleared()
    }
}