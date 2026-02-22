package com.ledokoz.linguaboost.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.ledokoz.linguaboost.data.AppDatabase
import com.ledokoz.linguaboost.data.model.Word
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class WordViewModel(application: Application) : AndroidViewModel(application) {
    private val database = AppDatabase.getDatabase(application, viewModelScope)
    private val wordDao = database.wordDao()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedCategory = MutableStateFlow("All")
    val selectedCategory: StateFlow<String> = _selectedCategory.asStateFlow()

    val words: StateFlow<List<Word>> = combine(
        wordDao.getAllWords(),
        _searchQuery,
        _selectedCategory
    ) { allWords, query, category ->
        allWords.filter { word ->
            val matchesQuery = word.original.contains(query, ignoreCase = true) ||
                               word.translation.contains(query, ignoreCase = true)
            val matchesCategory = category == "All" || word.category == category
            matchesQuery && matchesCategory
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val categories: StateFlow<List<String>> = wordDao.getAllWords().map { allWords ->
        listOf("All") + allWords.map { it.category }.distinct().sorted()
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), listOf("All"))

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun updateCategory(category: String) {
        _selectedCategory.value = category
    }
}
