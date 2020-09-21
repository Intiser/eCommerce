package com.ahsan.ecomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahsan.ecomapp.manager.AppActivityManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppActivityManager.gotoLoginActivity(this, true)
    }
}