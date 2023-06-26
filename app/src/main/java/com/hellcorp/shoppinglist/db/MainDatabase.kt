package com.hellcorp.shoppinglist.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hellcorp.shoppinglist.entities.Library
import com.hellcorp.shoppinglist.entities.NoteItem
import com.hellcorp.shoppinglist.entities.ShoppingListItem
import com.hellcorp.shoppinglist.entities.ShoppingListNames

@Database(
    entities = [Library::class, NoteItem::class,
        ShoppingListItem::class, ShoppingListNames::class],
    version = 1
)
abstract class MainDatabase : RoomDatabase() {
    abstract  fun getDao(): Dao //Получение доступа к интерфейсу Dao
    companion object {
        @Volatile
        private var INSTANCE: MainDatabase? = null
        fun getDataBase(context: Context): MainDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDatabase::class.java,
                    "shopping_list.db"
                ).build()
                instance
            }
        }
    }
}