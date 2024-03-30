package com.nevratov.alarmclock.data.database.dbModels

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alarm_items")
data class AlarmItemDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val time: String,
    val enabled: Boolean,
    val description: String,
    val days: String,
    val timeToStart: String
)
