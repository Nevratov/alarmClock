package com.nevratov.alarmclock.domain.repository

import com.nevratov.alarmclock.domain.entity.AlarmItem

interface AlarmRepository {

    fun addAlarm()

    fun deleteAlarm(item: AlarmItem)

    fun editAlarm(item: AlarmItem)
}