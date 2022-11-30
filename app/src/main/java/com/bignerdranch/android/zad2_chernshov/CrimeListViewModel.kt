package com.bignerdranch.android.zad2_chernshov

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel(){
    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved

        }
    }
}