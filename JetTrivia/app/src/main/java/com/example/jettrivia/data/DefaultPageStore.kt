package com.example.jettrivia.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class DefaultPageStore @Inject constructor(private val context: Context): PageStore {
    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("page")
        private val PAGE_KEY = intPreferencesKey("current_page")
    }

    override fun getPage(): Flow<Int> = context.dataStore.data.map { preferences ->
        preferences[PAGE_KEY] ?: 0
    }

    override suspend fun savePage(page: Int) {
        context.dataStore.edit { preferences ->
            preferences[PAGE_KEY] = page
        }
    }
}