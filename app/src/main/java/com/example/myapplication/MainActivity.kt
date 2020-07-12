package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun login() {
        //登录功能
    }

    private fun loadDate() {
        //网络获取数据
    }

    private fun upload() {
        //上传数据
    }
}
