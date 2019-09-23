package com.example.tasklistmanagement.BottomFragement

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodayViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Today task!!!!"
    }
    val text: LiveData<String> = _text
}