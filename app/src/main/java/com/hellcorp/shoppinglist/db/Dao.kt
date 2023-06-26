package com.hellcorp.shoppinglist.db
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.hellcorp.shoppinglist.entities.NoteItem
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Query("SELECT * FROM note_list") //Запрос в БД всех элементов
    fun getAllNotes() : Flow<List<NoteItem>> //Получение всех элементов. С Flow не требуется запуска получения в корутине
    @Insert
    suspend fun insertNote(note: NoteItem) // Вставка элементов будет запускаться в корутине
}