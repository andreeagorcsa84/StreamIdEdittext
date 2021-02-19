package com.example.edittext

import android.widget.EditText
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter

    @BindingAdapter("stream")
    fun EditText.bindObjectInText(value: Any?) {
        value?.let {
            if (value!=tag) { // stores the original value
                tag = value   // prevents duplicate/extra modification
                if (value is Int)
                    setText(java.lang.Integer.toHexString(value))
            }
        }
    }

    // used for retrieving values from the EditText
    // and setting those value for the TestModel
    @InverseBindingAdapter(attribute = "stream", event = "android:textAttrChanged")
    fun getText(editText: EditText): Int {
        return editText.text.toString().toInt(radix = 16) // 16 is for hexa values
    }
