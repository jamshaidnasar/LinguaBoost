package com.ledokoz.linguaboost.data.dao

import androidx.room.*
import com.ledokoz.linguaboost.data.model.Word
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {
    @Query("SELECT * FROM words ORDER BY lastReviewed ASC")
    fun getAllWords(): Flow<List<Word>>

    @Query("SELECT * FROM words WHERE category = :category")
    fun getWordsByCategory(category: String): Flow<List<Word>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWord(word: Word)

    @Delete
    suspend fun deleteWord(word: Word)

    @Update
    suspend fun updateWord(word: Word)

    @Query("UPDATE words SET isLearned = :isLearned WHERE id = :wordId")
    suspend fun setLearnedStatus(wordId: Int, isLearned: Boolean): Int

    @Query("SELECT * FROM words WHERE isLearned = 0 ORDER BY lastReviewed ASC")
    fun getUnlearnedWords(): Flow<List<Word>>
}
