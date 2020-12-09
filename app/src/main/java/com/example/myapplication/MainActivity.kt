 package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navView : BottomNavigationView = findViewById(R.id.nav)

        val navController =findNavController(R.id.nav_host_fragment)

        val appBarConfig = AppBarConfiguration(setOf(
            R.id.nav_home,
            R.id.nav_dashboard,
            R.id.nav_notification,
            R.id.nav_help
        ))

        setupActionBarWithNavController(navController , appBarConfig)
        navView.setupWithNavController(navController)

    }

}