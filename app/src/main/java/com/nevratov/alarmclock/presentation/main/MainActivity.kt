package com.nevratov.alarmclock.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.nevratov.alarmclock.presentation.set_alarm.SetAlarmScreen
import com.nevratov.alarmclock.ui.theme.AlarmClockTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlarmClockTheme() {
                Box(modifier = Modifier.background(Color.Black)) {
                    SetAlarmScreen()
                }
            }
        }

    }
}
