package com.example.jettrivia.data

import kotlinx.coroutines.flow.Flow


interface PageStore {
    fun getPage(): Flow<Int>
    suspend fun savePage(page: Int)
}