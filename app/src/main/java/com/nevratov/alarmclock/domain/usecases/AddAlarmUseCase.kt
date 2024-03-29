package com.nevratov.alarmclock.domain.usecases

import com.nevratov.alarmclock.domain.repository.AlarmRepository

class AddAlarmUseCase(private val repository: AlarmRepository) {

    operator fun invoke() = repository.addAlarm()
}