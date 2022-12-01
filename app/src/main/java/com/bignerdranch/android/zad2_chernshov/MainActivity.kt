package com.bignerdranch.android.zad2_chernshov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity(), CrimeListFragment.Callbacks {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (currentFragment==null)
        {
            val fragment = CrimeFragment()//CrimeFragment.newInstance(crimeId)//CrimeListFragment.newInstance()
            supportFragmentManager.beginTransaction().add(R.id.fragment_container,fragment).commit()
        }
    }
    override fun onCrimeSelected(crimeId: UUID)
    {
        //Log.d(TAG,"MainActivity запишите отладочный отчет в журнал onCrimeSelected(UUID)")
        val fragment = CrimeFragment()
        supportFragmentManager



            .beginTransaction()
            .replace(R.id.fragment_container, fragment)

            .addToBackStack(null)
           //. добавьте транзакцию замены в обратный стек со значением (null)
            .commit()
    }
}