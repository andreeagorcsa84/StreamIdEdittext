package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.edittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(TestViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        // shows up a toast everytime the value from the VM changes (stream_id)
        viewModel.testModel.observe(this, {
            Toast.makeText(this, it?.streamId.toString(), Toast.LENGTH_SHORT).show()
        })
    }
}