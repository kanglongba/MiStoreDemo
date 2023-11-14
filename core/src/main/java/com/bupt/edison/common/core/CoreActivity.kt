package com.bupt.edison.common.core

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bupt.edison.mi.core.databinding.ActivityCoreBinding

class CoreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.name.setOnClickListener {
            Toast.makeText(this@CoreActivity, "Hi!", Toast.LENGTH_SHORT)
                .show()
        }
    }
}