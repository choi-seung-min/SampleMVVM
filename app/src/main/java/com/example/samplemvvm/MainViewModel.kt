package com.example.samplemvvm

import androidx.databinding.ObservableField

class MainViewModel{
    val firstNum = ObservableField<String>()
    val secondNum = ObservableField<String>()
    val res = ObservableField<String>()
    fun calc(op: Char) {
        res.set(when (op){
            '+' -> (firstNum.get()!!.toInt() + secondNum.get()!!.toInt()).toString()
            '-' -> (firstNum.get()!!.toInt() - secondNum.get()!!.toInt()).toString()
            '*' -> (firstNum.get()!!.toInt() * secondNum.get()!!.toInt()).toString()
            '/' -> (firstNum.get()!!.toInt() / secondNum.get()!!.toInt()).toString()
            else -> ""
        })
    }
}