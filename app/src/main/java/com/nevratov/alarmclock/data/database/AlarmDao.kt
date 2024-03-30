package com.nevratov.alarmclock.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nevratov.alarmclock.data.database.dbModels.AlarmItemDbModel
import com.nevratov.alarmclock.domain.entity.AlarmItem

@Dao
interface AlarmDao {

    @Query("SELECT * FROM alarm_items")
    fun getAlarmList(): List<AlarmItemDbModel>

    @Query("SELECT * FROM alarm_items WHERE id=:alarmItemId")
    suspend fun getAlarmItem(alarmItemId: Int): AlarmItemDbModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAlarmItem(alarmItem: AlarmItem)

    @Query("DELETE FROM alarm_items WHERE id=:alarmItemId")
    suspend fun deleteAlarmItem(alarmItemId: Int)
}