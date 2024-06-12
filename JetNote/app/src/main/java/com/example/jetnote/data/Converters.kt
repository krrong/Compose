package com.example.jetnote.data

import androidx.room.TypeConverter
import java.util.Date

class Converters {
    @TypeConverter
    fun dataFromTimeStamp(timeStamp: Long): Date {
        return Date(timeStamp)
    }

    @TypeConverter
    fun timeStampFromDate(date: Date): Long {
        return date.time
    }
}