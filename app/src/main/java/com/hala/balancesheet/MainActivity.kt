package com.hala.balancesheet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.hala.balancesheet.fragments.AddTransactionsFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment()
    }


    private fun addFragment() {

        val fragmentManager1: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager1.beginTransaction()
        val addTransactionsFragment = AddTransactionsFragment()
        fragmentTransaction.add(R.id.add_transation_fragment, addTransactionsFragment)
        fragmentTransaction.commit()
    }
}
