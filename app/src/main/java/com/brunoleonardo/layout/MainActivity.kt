package com.brunoleonardo.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
        Log.v("Cycledevie", "Appel de methode: onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.v("Cycledevie", "Appel de methode: onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.v("Cycledevie", "Appel de methode: onResume()")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Cycledevie", "Appel de methode: onStop()")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Cycledevie", "Appel de methode: onPause()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("Cycledevie", "Appel de methode: onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("Cycledevie", "Appel de methode: onRestart()")
    }

}

