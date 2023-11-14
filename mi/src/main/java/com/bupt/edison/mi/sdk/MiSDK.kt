package com.bupt.edison.mi.sdk

import android.content.Context
import android.content.Intent
import com.bupt.edison.common.core.Core
import com.bupt.edison.common.core.CoreActivity

/**
 *
 * @Author: edison qian
 * @Email: edison.qian@applovin.com
 * @CreateDate: 2023/11/14 15:32
 * @Description: 类作用描述【短短几句话，可以迅速让别人知道这个类的作用】
 */
object MiSDK {

    fun getName(): String {
        return "Mi ${Core.getCoreModuleName()}"
    }

    fun startCoreActivity(context: Context) {
        val intent = Intent(context, CoreActivity::class.java)
        context.startActivity(intent)
    }
}