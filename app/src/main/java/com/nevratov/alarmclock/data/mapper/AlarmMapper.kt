package com.nevratov.alarmclock.data.mapper

import com.nevratov.alarmclock.data.database.dbModels.AlarmItemDbModel
import com.nevratov.alarmclock.domain.entity.AlarmItem

class AlarmMapper {

    fun mapEntityToDbModel(alarmItem: AlarmItem): AlarmItemDbModel {
        return AlarmItemDbModel(
            id = alarmItem.id,
            time = alarmItem.time,
            enabled = alarmItem.enabled,
            description = alarmItem.description,
            days = alarmItem.days,
            timeToStart = alarmItem.timeToStart
        )
    }

    fun mapDbModelToEntity(alarmItemDbModel: AlarmItemDbModel): AlarmItem {
        return AlarmItem(
            id = alarmItemDbModel.id,
            time = alarmItemDbModel.time,
            enabled = alarmItemDbModel.enabled,
            description = alarmItemDbModel.description,
            days = alarmItemDbModel.days,
            timeToStart = alarmItemDbModel.timeToStart
        )
    }
}