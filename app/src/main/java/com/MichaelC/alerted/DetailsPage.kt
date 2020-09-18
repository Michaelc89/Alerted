package com.MichaelC.alerted



import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import java.util.*


class DetailsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_page)


        /*val textT: TextView = findViewById(R.id.textViewTime) as TextView
        val textD: TextView = findViewById(R.id.textViewDate) as TextView
*/
        val OverAlltd = Calendar.getInstance()


        //textViewTime.text="Time"

    }


    fun showTimePickerDialog(v: View) {
        TimePickerFragment().show(supportFragmentManager, "timePicker")
    }


    class TimePickerFragment : DialogFragment(), TimePickerDialog.OnTimeSetListener {

        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            // Use the current time as the default values for the picker
            val c = Calendar.getInstance()
            val hour = c.get(Calendar.HOUR_OF_DAY)
            val minute = c.get(Calendar.MINUTE)

            // Create a new instance of TimePickerDialog and return it
            return TimePickerDialog(
                activity,
                this,
                hour,
                minute,
                DateFormat.is24HourFormat(activity)
            )
        }

        override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {

            val td = Calendar.getInstance()
            td.set(1, 12, 1970, hourOfDay, minute)
            //td.time.toString()
            Log.d("time*", td.time.toString())

            try {



                //============================



               // textViewTime.text=  td.time.toString()


            }
            catch (e: IllegalArgumentException)
            {Log.d("ERR", e.toString())}
        }
    }

}

