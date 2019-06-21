package com.example.scan.scanzxing.utils

import android.content.Context
import android.telephony.TelephonyManager

/**
 * Allen
 * 2019/6/21 0021 15:31
 **/
object DeviceUtils{
    /**
     * @param slotId  slotId为卡槽Id，它的值为 0、1；
     * @return
     */
    @JvmStatic
    fun getIMEI(context: Context,slotId: Int): String {
        return try {
            val manager = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
            val method = manager.javaClass.getMethod("getImei", Int::class.javaPrimitiveType!!)
            method.invoke(manager, slotId) as String
        } catch (e: Exception) {
            ""
        }
    }
}