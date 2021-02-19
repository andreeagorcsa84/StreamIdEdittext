package com.example.edittext

import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {

    val _testModel = CustomMutableLiveData<TestModel>()

    val testModel
        get() = _testModel

    init {
        _testModel.value = TestModel()
    }
}