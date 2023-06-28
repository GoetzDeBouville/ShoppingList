package com.hellcorp.shoppinglist.activities

import android.app.Application
import com.hellcorp.shoppinglist.db.MainDatabase

class MainApp : Application() {
    val database by lazy { MainDatabase.getDataBase(this) }
}