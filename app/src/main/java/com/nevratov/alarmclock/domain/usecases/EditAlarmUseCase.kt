package com.nevratov.alarmclock.domain.usecases

import com.nevratov.alarmclock.domain.entity.AlarmItem
import com.nevratov.alarmclock.domain.repository.AlarmRepository

class EditAlarmUseCase(private val repository: AlarmRepository) {

    operator fun invoke(item: AlarmItem) = repository.editAlarm(item)
}