package com.bupt.edison.mi.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bupt.edison.mi.sdk.MiSDK
import com.bupt.edison.mi.store.databinding.ActivityMiStoreMainBinding

class MiStoreMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMiStoreMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMiStoreMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.title.text = MiSDK.getName()
        binding.start.setOnClickListener {
            MiSDK.startCoreActivity(this@MiStoreMainActivity)
        }
    }
}