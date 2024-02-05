package com.example.fragmentex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        val fragmentManager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        val fragment1 = OneFragment()
        val fragment2 = TwoFragment()

        transaction.addToBackStack(null)
        transaction.add(R.id.fragment_content, fragment1)
        transaction.commit()
        binding.btn1.setOnClickListener{
            transaction.replace(R.id.fragment_content, fragment1)
//            transaction.commit()
        }
        binding.btn2.setOnClickListener{
            transaction.replace(R.id.fragment_content, fragment2)
//            transaction.commit()
        }
    }
}

