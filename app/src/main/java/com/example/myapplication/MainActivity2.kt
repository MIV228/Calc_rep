package com.example.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2) //лол!!!111! это была самая тупая ошибка лол!!!


        val per = findViewById<Button>(R.id.w_pereh)
        per.setOnClickListener {
            val perehod = Intent(this, MainActivity::class.java)
            startActivity(perehod)
        }

         try {
//еееее роккк
             w_main.setOnClickListener{ appendOnExpression("", true) }
             w_c_result.setOnClickListener{ appendOnExpression("", true) }
             w_c_expression.setOnClickListener{ appendOnExpression("", true) }
             //Числа
             w_c_one.setOnClickListener{ appendOnExpression("1", true)
                 animate(it)
             }
             w_c_two.setOnClickListener{ appendOnExpression("2", true)
                 animate(it)
             }
             w_c_three.setOnClickListener{ appendOnExpression("3", true)
                 animate(it)
             }
             w_c_four.setOnClickListener{ appendOnExpression("4", true)
                 animate(it)
             }
             w_c_five.setOnClickListener{ appendOnExpression("5", true)
                 animate(it)
             }
             w_c_six.setOnClickListener{ appendOnExpression("6", true)
                 animate(it)
             }
             w_c_seven.setOnClickListener{ appendOnExpression("7", true)
                 animate(it)
             }
             w_c_eight.setOnClickListener{ appendOnExpression("8", true)
                 animate(it)
             }
             w_c_nine.setOnClickListener{ appendOnExpression("9", true)
                 animate(it)
             }
             w_c_zero.setOnClickListener{ appendOnExpression("0", true)
                 animate(it)
             }
             w_c_dot.setOnClickListener{ appendOnExpression(".", true)
                 animate(it)
             }
             //Операции
             w_c_plus.setOnClickListener{ appendOnExpression("+", false)
                 animate(it)
             }
             w_c_minus.setOnClickListener{ appendOnExpression("-", false)
                 animate(it)
             }
             w_c_multi.setOnClickListener{ appendOnExpression("*", false)
                 animate(it)
             }
             w_c_div.setOnClickListener{ appendOnExpression("/", false)
                 animate(it)
             }
             w_c_open.setOnClickListener{ appendOnExpression("(", false)
                 animate(it)
             }
             w_c_close.setOnClickListener{ appendOnExpression(")", false)
                 animate(it)
             }
             w_c_ac.setOnClickListener {
                 animate(it)
                 w_c_expression.text = ""
                 w_c_result.text = ""
             }
             w_c_backspace.setOnClickListener{
                 animate(it)
                 val string = w_c_expression.text.toString()
                 if (string.isNotEmpty()) {
                     w_c_expression.text = string.substring(0, string.length - 1)
                 }
                 w_c_result.text = ""
             }
             w_c_equals.setOnClickListener {
                 animate(it)
                 try {
                     val expression = ExpressionBuilder(w_c_expression.text.toString()).build()
                     val result = expression.evaluate()
                     val longResult = result.toLong()
                     if (result == longResult.toDouble())
                         w_c_result.text = longResult.toString()
                     else
                         w_c_result.text = result.toString()
                 } catch (e: Exception) {
                     Log.d("Exception", " message " + e.message)
                 }
                 animate(w_c_result)
             }
         }
         catch (e:Exception) {
             Log.d("Exception", " message " + e.message)
         }}

    fun appendOnExpression(string: String, canClear: Boolean) {
        if (w_c_result.text.isNotEmpty()) {
            w_c_expression.text = ""
        }
        if (canClear) {
            w_c_result.text = ""
            w_c_expression.append(string)
        } else {
            w_c_expression.append(w_c_result.text)
            w_c_expression.append(string)
            w_c_result.text = ""
        }
    }

    fun animate(view: View) {
        MainScope().launch {
            for (i in 1..2) {
                for (i in 0..89) {
                    view.rotationX = view.rotationX + 1
                    delay(1)
                }
                for (i in 90..179) {
                    view.rotationX = view.rotationX + 1
                    delay(1)
                }
            }
        }
    }
}