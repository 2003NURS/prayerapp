package com.example.prayer_app.activities


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController

import com.example.prayer_app.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        NavigationUI.setupWithNavController(bottomNavigationView, navController)

        setupActionBarWithNavController(navController)

    }
////Comment It is Button Back
   override fun onSupportNavigateUp(): Boolean {
       val controller = findNavController(R.id.fragmentContainerView)
       return controller.navigateUp() || super.onSupportNavigateUp()
   }
}