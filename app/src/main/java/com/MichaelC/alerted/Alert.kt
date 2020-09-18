package com.MichaelC.alerted

import java.sql.Time
import java.util.*

class Alert {

    var id: Int
    var alertName: String
    var location: Double
    var description: String
    var time: Time
    var date: Date

    constructor(id: Int,alertName: String,location: Double,description: String,time: Time,date: Date) {
        this.id = id
        this.alertName = alertName
        this.location = location
        this.description = description
        this.time = time
        this.date = date
    }
}