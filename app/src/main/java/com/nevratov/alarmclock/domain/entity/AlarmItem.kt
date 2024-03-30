package com.nevratov.alarmclock.domain.entity

data class AlarmItem(
    val id: Int = 0,
    val time: String,
    val enabled: Boolean,
    val description: String,
    val days: String,
    val timeToStart: String
)
