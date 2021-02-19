package com.example.edittext

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

data class TestModel(var _streamId: Int = 0) : BaseObservable() {

    var streamId: Int
        @Bindable get() = _streamId
        set(value) {
            _streamId = value
            notifyPropertyChanged(BR.streamId)
        }
}
