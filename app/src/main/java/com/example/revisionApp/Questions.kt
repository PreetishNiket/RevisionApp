package com.example.revisionApp

import android.graphics.Color
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

enum class Questions {
    Text,
    Radio,
    CheckBox
}
data class Question(val id:Int,val type:Questions,val qText:String,
                val options:List<String>?,val answers:List<String>)


//var count=0
//var flag=0
//button.setOnClickListener {
//    count++
//    textView.text = "Button Clicked $count times"
//    Toasty.success(this,textView.text, Toast.LENGTH_SHORT,true).show()
//}
//
//button2.setOnClickListener {
//    if (flag==0)
//    {
//        flag=1
//        button.isEnabled=false
//        button2.text= "Enable"
//        val snack= Snackbar.make(view,"This is SnackBar,Disabled", Snackbar.LENGTH_LONG)
//        snack.setAction("Undo") {
//            Toasty.info(this,"Undo Successful", Toast.LENGTH_SHORT,true).show()
//            button.isEnabled=true
//            button2.text="Disable"
//        }
//        snack.setActionTextColor(Color.RED)
//        snack.setTextColor(Color.YELLOW)
//        snack.show()
//    }
//    else
//    {
//        flag=0
//        button.isEnabled=true
//        button2.text="Disable"
//    }
//}