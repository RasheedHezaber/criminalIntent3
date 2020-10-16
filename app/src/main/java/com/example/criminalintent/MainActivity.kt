package com.example.criminalintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        try {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
            if (currentFragment == null) {
                val fragment = CrimeListFragment.newInstance()
                supportFragmentManager . beginTransaction ().add(
                    R.id.fragment_container,
                    fragment
                ).commit()
            }
        }catch (e:Exception){
            print(e.message)
        }
    }
    }
