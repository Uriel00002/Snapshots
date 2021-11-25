package com.example.snapshots

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snapshots.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var nBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(nBinding.root)

        setupBottomNav()
    }

    private fun setupBottomNav(){
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.hostFragment, HomeFragment()).commit()
    }

}