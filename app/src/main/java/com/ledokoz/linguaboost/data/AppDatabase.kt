package com.ledokoz.linguaboost.data

import android.content.Context
import androidx.room.*

import com.ledokoz.linguaboost.data.dao.WordDao
import com.ledokoz.linguaboost.data.model.Word
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [Word::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wordDao(): WordDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: android.content.Context, scope: kotlinx.coroutines.CoroutineScope): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = androidx.room.Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "linguaboost_database"
                )
                .addCallback(DatabaseCallback(scope, context))
                .build()
                INSTANCE = instance
                instance
            }
        }

        private class DatabaseCallback(
            private val scope: kotlinx.coroutines.CoroutineScope,
            private val context: android.content.Context
        ) : RoomDatabase.Callback() {
            override fun onCreate(db: androidx.sqlite.db.SupportSQLiteDatabase) {
                super.onCreate(db)
                INSTANCE?.let { database ->
                    scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                        populateDatabase(database.wordDao())
                    }
                }
            }

            suspend fun populateDatabase(wordDao: WordDao) {
                // Prepopulate with words
                wordDao.insertWords(PrepopulatedData.commonWords)
            }
        }
    }
}
