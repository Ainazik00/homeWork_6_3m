package com.example.homework_6_3m

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_6_3m.MainFragment
import com.example.homework_6_3m.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment())
                .commit()
        }
    }
}
