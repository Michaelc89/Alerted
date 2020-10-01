package com.MichaelC.alerted



import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Build
import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_details_page.*
import java.text.SimpleDateFormat
import java.util.*


class DetailsPage : AppCompatActivity() {

//    var textT: TextView = findViewById<TextView>(R.id.textViewTime)
var alertOne = Alert(1,"null",1.0,"null", Date(), Date())
    var formate = SimpleDateFormat("dd MMM, YYYY",Locale.US)
    var timeFormat = SimpleDateFormat("hh:mm a", Locale.US)
    //var alertOne = Alert(1, "null", 1.0, "null",nowT ,nowD )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_page)

        var textT : TextView = findViewById(R.id.textViewTime) as TextView

        var textD : TextView = findViewById(R.id.textViewDate) as TextView




        buttonTime.setOnClickListener {
            val now = Calendar.getInstance()

            try {
                if(textT.text != "Show Dialog") {
                    val date = timeFormat.parse(textT.text.toString())
                    //now.time = date
                }
            }catch (e:Exception){
                e.printStackTrace()
            }
            val timePicker = TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                val selectedTime = Calendar.getInstance()
                selectedTime.set(Calendar.HOUR_OF_DAY,hourOfDay)
                selectedTime.set(Calendar.MINUTE,minute)
                textT.text = timeFormat.format(selectedTime.time)
            },
                now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE),false)
            timePicker.show()

        }

        buttonDate.setOnClickListener {
            val now = Calendar.getInstance()
            val datePicker = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                val selectedDate = Calendar.getInstance()
                selectedDate.set(Calendar.YEAR,year)
                selectedDate.set(Calendar.MONTH,month)
                selectedDate.set(Calendar.DAY_OF_MONTH,dayOfMonth)
                val date2 = formate.format(selectedDate.time)//seleccted date to be put in class
                textD.text = date2.toString()
                //Log.d("Car",selectedDate.toString())
                Toast.makeText(this,"date : " + selectedDate,Toast.LENGTH_SHORT).show()
            },
                    now.get(Calendar.YEAR),now.get(Calendar.MONTH),now.get(Calendar.DAY_OF_MONTH))
            datePicker.show()
//            try {
//                if(textD.text != "Show Dialog") {
//                    val date2 = timeFormat.format(textD.text.toString())
//                    now.time = date2
//                }
//            }catch (e:Exception){
//                e.printStackTrace()
//            }



        }

    }

}

