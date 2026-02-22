package com.ledokoz.linguaboost.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "words")
data class Word(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val original: String,
    val translation: String,
    val languageCode: String,
    val category: String = "General",
    val proficiency: Int = 0,
    val isLearned: Boolean = false,
    val lastReviewed: Long = System.currentTimeMillis()
)
