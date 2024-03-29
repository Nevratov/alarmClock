package com.nevratov.alarmclock.presentation.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nevratov.alarmclock.ui.theme.AlarmClockTheme
import com.nevratov.alarmclock.ui.theme.Coral
import com.nevratov.alarmclock.ui.theme.MediumGray
import com.nevratov.alarmclock.ui.theme.Purple40

@Composable
fun AlarmItem() {
    val gradientColorsUnchecked = listOf(Coral, Purple40)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.horizontalGradient(colors = gradientColorsUnchecked),
                shape = RoundedCornerShape(12))
            .padding(16.dp)
    ) {
        Column (

        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "Утренний будильник",
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "5:30",
                        fontSize = 56.sp,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
                Switch(
                    checked = false,
                    onCheckedChange = {},
                    modifier = Modifier
                        .scale(1.5f)
                        .padding(top = 4.dp, end = 10.dp),
                    colors = SwitchDefaults.colors(
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = MediumGray,


                    ),
                    thumbContent = {
                        RoundedCornerShape(40.dp)
                    }
                )
            }

            Spacer(modifier = Modifier.size(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "ПН, ВТ, ЧТ, СБ",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onPrimary
                )
                Text(
                    text = "12 ч 30 м",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }

        }
    }
}

@Preview
@Composable
fun PreviewAlarmElement() {
    AlarmClockTheme(darkTheme = true) {
        AlarmItem()
    }
}