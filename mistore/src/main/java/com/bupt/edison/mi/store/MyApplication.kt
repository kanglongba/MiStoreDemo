package com.bupt.edison.mi.store

import android.app.Application
import com.bupt.edison.mi.sdk.MiSDK

/**
 *
 * @CreateDate: 2024/1/12 20:26
 * @Description: 类作用描述【短短几句话，可以迅速让别人知道这个类的作用】
 */
class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        MiSDK.init()
    }
}