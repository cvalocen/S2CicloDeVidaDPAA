package com.example.s2ciclodevidadpaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val tag: String = "INF-STATE";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(tag, "Main Activity-->onCreate")
    }
    override fun onStart(){
        super.onStart()
        Log.i(tag, "Main Activity-->onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(tag, "Main Activity-->onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i(tag, "Main Activity-->onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i(tag, "Main Activity-->onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "Main Activity-->onDestroy")
    }
}