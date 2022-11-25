package com.bignerdranch.android.zad2_chernshov

import java.util.UUID

class Crime (var id: UUID = UUID.randomUUID()){
    var title: String = ""
    var date: Int = 0
    var isSoul: Boolean = false
}