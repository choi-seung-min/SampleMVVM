package com.example.samplemvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel(){
    val firstNum = MutableLiveData<String>()
    val secondNum = MutableLiveData<String>()
    val res = MutableLiveData<String>()
    fun calc(op: Char) {
        Log.d("MainViewModel", "${firstNum.value}, ${secondNum.value}")
        res.value = when (op){
            '+' -> (firstNum.value!!.toInt() + secondNum.value!!.toInt()).toString()
            '-' -> (firstNum.value!!.toInt() - secondNum.value!!.toInt()).toString()
            '*' -> (firstNum.value!!.toInt() * secondNum.value!!.toInt()).toString()
            '/' -> (firstNum.value!!.toInt() / secondNum.value!!.toInt()).toString()
            else -> ""
        }
        Log.d("MainViewModel", "${res.value}")
    }
}