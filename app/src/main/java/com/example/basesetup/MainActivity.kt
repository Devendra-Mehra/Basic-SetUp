package com.example.basesetup

import android.os.Bundle
import android.util.Log
import com.example.basesetup.base.BaseActivity
import com.example.basesetup.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun getLayoutResource() = R.layout.activity_main


    override fun setUp() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("", "")

    }
}
