package com.bupt.edison.common.core

/**
 *
 * @Author: edison qian
 * @Email: edison.qian@applovin.com
 * @CreateDate: 2023/11/14 15:30
 * @Description: 类作用描述【短短几句话，可以迅速让别人知道这个类的作用】
 */
object Core {

    var name: String = "Core Module"

    fun setCoreModuleName(coreName: String) {
        name = coreName
    }

    fun getCoreModuleName(): String {
        return name
    }
}