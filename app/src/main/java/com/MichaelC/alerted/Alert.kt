package com.MichaelC.alerted

import android.os.Build
import androidx.annotation.RequiresApi
import java.sql.Time
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*

public class Alert {

    var id: Int
    var alertName: String
    var location: Double
    var description: String
    var time: Date
    var date: Date

    constructor(
        id: Int,
        alertName: String,
        location: Double,
        description: String,
        time: Date,
        date: Date
    ) {
        this.id = id
        this.alertName = alertName
        this.location = location
        this.description = description
        this.time = time
        this.date = date
    }






}