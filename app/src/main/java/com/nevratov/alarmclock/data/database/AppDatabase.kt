package com.nevratov.alarmclock.data.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nevratov.alarmclock.domain.entity.AlarmItem

@Database(entities = [AlarmItem::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun alarmDao(): AlarmDao

    companion object {
        private var INSTANCE: AppDatabase? = null
        private const val DB_NAME = "alarmClock.db"
        private val LOCK = Any()

        fun getInstance(application: Application): AppDatabase {
            INSTANCE?.let {
                return it
            }
            synchronized(LOCK) {
                INSTANCE?.let {
                    return it
                }
                val db = Room.databaseBuilder(application, AppDatabase::class.java, DB_NAME).build()
                INSTANCE = db
                return db
            }
        }
    }
}