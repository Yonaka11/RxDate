package com.asada.myapplication

import android.content.res.Resources
import android.os.Bundle
import android.widget.DatePicker
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        HomeScreen()

        }

}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
        Text(
            text = from,
            fontSize = 25.sp,
            lineHeight = 30.sp,
            textAlign = TextAlign.Center,
            modifier = modifier


        )


        Text(
            text = message,
            fontSize = 40.sp,
            color = Color.Red,
            modifier = Modifier
                .padding(16.dp)

        )

}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {

        GreetingText(message = "Happy Birthday Sam!", from = "From Emma")

}
fun DayAdder( days: Int):LocalDateTime {

    var qdog = LocalDateTime.now().plusDays(days.toLong())
    return qdog
}
@Composable
fun HomeScreen(){
    var calcium = LocalDateTime.now().plusDays(28)
    var dateformat = DateTimeFormatter.ofPattern("MM-dd-yyyy")
        var st28days = calcium.format(dateformat)



        Column {GreetingText(
            message = DayAdder(28).format(dateformat),
            from = "28 Days",

        )


            GreetingText(
                message = DayAdder(30).format(dateformat),
                from = "30 Days",

            )

            GreetingText(
                message = DayAdder(60).format(dateformat),
                from = "60 Days",

            )

            GreetingText(
                message = DayAdder(90).format(dateformat),
                from = "90 Days",

            )

            GreetingText(
                message = DayAdder(180).format(dateformat),
                from = "180 Days",

            )

        }
    }





}