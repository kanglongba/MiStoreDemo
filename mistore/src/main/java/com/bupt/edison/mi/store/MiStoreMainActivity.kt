package com.bupt.edison.mi.store

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bupt.edison.common.core.Core
import com.bupt.edison.common.core.CoreActivity
import com.bupt.edison.mi.sdk.MiSDK
import com.bupt.edison.mi.store.databinding.ActivityMiStoreMainBinding

class MiStoreMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMiStoreMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMiStoreMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.title.text = """
            ${Core.getCoreModuleName()}
            ${MiSDK.getName()}"""
        binding.start.setOnClickListener {
            MiSDK.startCoreActivity(this@MiStoreMainActivity)
        }
        binding.startDirect.setOnClickListener {
            val intent = Intent(this@MiStoreMainActivity, CoreActivity::class.java)
            startActivity(intent)
        }
        binding.startMi.setOnClickListener {
            val intent =
                Intent(this@MiStoreMainActivity, com.bupt.edison.mi.sdk.CoreActivity::class.java)
            startActivity(intent)
        }
    }
}