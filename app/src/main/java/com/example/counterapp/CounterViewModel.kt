package com.example.counterapp

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterViewModel : ViewModel() {

    var _count = MutableStateFlow(0)
    var count = _count.asStateFlow()

    fun increace(){
        _count.value += 1
    }

    fun reset(){
        _count.value = 0
    }
}