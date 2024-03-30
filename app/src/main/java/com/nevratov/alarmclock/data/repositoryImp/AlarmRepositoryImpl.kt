package com.nevratov.alarmclock.data.repositoryImp

import android.app.AlarmManager
import android.app.Application
import android.content.Context
import com.nevratov.alarmclock.data.database.AppDatabase
import com.nevratov.alarmclock.domain.entity.AlarmItem
import com.nevratov.alarmclock.domain.repository.AlarmRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.Calendar

class AlarmRepositoryImpl(private val application: Application) : AlarmRepository {

    private val alarmDao = AppDatabase.getInstance(application).alarmDao()
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    override fun addAlarm(item: AlarmItem) {
        coroutineScope.launch {
            alarmDao.insertAlarmItem(item)
        }
    }

    override fun deleteAlarm(item: AlarmItem) {
        coroutineScope.launch {
            alarmDao.deleteAlarmItem(item.id)
        }
    }

    override fun editAlarm(item: AlarmItem) {
        coroutineScope.launch {
            alarmDao.insertAlarmItem(item)
        }
    }

}