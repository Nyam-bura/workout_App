package com.jane.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jane.workoutlog.databinding.ActivityHomePageBinding
import com.jane.workoutlog.databinding.ActivitySignupBinding

class Home_pageActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()
        setupBottomNav()

    }
    fun castViews(){
//        bottom_navigation=findViewById(R.id.bottom_navigation)
//        binding.fcvhome=findViewById(R.id.fcvhome)

    }
    fun setupBottomNav(){
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.plan->{
                    val transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvhome,PlanFragment())
                    transaction.commit()
                    true

                }
                R.id.track->{
                    val transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvhome,TrackFragment())
                    transaction.commit()
                    true

            }
                R.id.profile->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvhome,ProfileFragment()).commit()
                    true
                }
            else->false

        }

    }
}
    }