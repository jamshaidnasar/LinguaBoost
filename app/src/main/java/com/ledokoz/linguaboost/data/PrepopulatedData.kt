package com.ledokoz.linguaboost.data

import com.ledokoz.linguaboost.data.model.Word

object PrepopulatedData {
    val commonWords = mutableListOf<Word>().apply {
        addAll(WordPart1.words)
        addAll(WordPart2.words)
        addAll(WordPart3.words)
        addAll(WordPart4.words)
        addAll(WordPart5.words)
        addAll(WordPart6.words)
        addAll(WordPart7.words)
        addAll(WordPart8.words)
        addAll(WordPart9.words)
        addAll(WordPart10.words)
        addAll(WordPart11.words)
        addAll(WordPart12.words)
        addAll(WordPart13.words)
        addAll(WordPart14.words)
        addAll(WordPart15.words)
        addAll(WordPart16.words)
    }
}
