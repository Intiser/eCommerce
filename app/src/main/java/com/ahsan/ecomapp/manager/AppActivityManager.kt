package com.ahsan.ecomapp.manager

import android.app.Activity
import android.content.Intent
import com.ahsan.ecomapp.authentication.ui.login.LoginActivity

object AppActivityManager {

    private fun checkFinish(activity: Activity, finish: Boolean){
        if(finish) activity.finish()
    }

    fun gotoLoginActivity(activity: Activity, finish: Boolean){
        val intent = Intent(activity, LoginActivity::class.java)
        activity.startActivity(intent)
        checkFinish(activity, finish)
    }


}