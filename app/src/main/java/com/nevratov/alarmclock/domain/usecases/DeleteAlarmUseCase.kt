package com.nevratov.alarmclock.domain.usecases

import com.nevratov.alarmclock.domain.entity.AlarmItem
import com.nevratov.alarmclock.domain.repository.AlarmRepository

class DeleteAlarmUseCase(private val repository: AlarmRepository) {

    operator fun invoke(item: AlarmItem) = repository.deleteAlarm(item)
}