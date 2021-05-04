package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//еееее роккк
        main.setOnClickListener { appendOnExpression("", true) }
        c_result.setOnClickListener { appendOnExpression("", true) }
        c_expression.setOnClickListener { appendOnExpression("", true) }
        //Числа
        c_one.setOnClickListener { appendOnExpression("1", true) }
        c_two.setOnClickListener { appendOnExpression("2", true) }
        c_three.setOnClickListener { appendOnExpression("3", true) }
        c_four.setOnClickListener { appendOnExpression("4", true) }
        c_five.setOnClickListener { appendOnExpression("5", true) }
        c_six.setOnClickListener { appendOnExpression("6", true) }
        c_seven.setOnClickListener { appendOnExpression("7", true) }
        c_eight.setOnClickListener { appendOnExpression("8", true) }
        c_nine.setOnClickListener { appendOnExpression("9", true) }
        c_zero.setOnClickListener { appendOnExpression("0", true) }
        c_dot.setOnClickListener { appendOnExpression(".", true) }
        //Операции
        c_plus.setOnClickListener { appendOnExpression("+", false)
        }
        c_minus.setOnClickListener { appendOnExpression("-", false)
        }
        c_multi.setOnClickListener { appendOnExpression("*", false)

        }
        c_div.setOnClickListener { appendOnExpression("/", false)

        }
        c_open.setOnClickListener { appendOnExpression("(", false)

        }
        c_close.setOnClickListener { appendOnExpression(")", false)

        }
        c_ac.setOnClickListener {
            c_expression.text = ""
            c_result.text = ""
        }
        c_backspace.setOnClickListener {
            val string = c_expression.text.toString()
            if (string.isNotEmpty()) {
                c_expression.text = string.substring(0, string.length-1)
            }
            c_result.text = ""
        }
        c_equals.setOnClickListener{
            try{
                val expression = ExpressionBuilder(c_expression.text.toString()).build()
                val result = expression.evaluate()
                val longResult = result.toLong()
                if(result == longResult.toDouble())
                    c_result.text = longResult.toString()
                else
                    c_result.text = result.toString()
            }
            catch (e:Exception){
                Log.d("Exception"," message " +e.message)
            }
        }
    }
    fun appendOnExpression(string: String, canClear: Boolean) {
            if (c_result.text.isNotEmpty()) {
                c_expression.text = ""
            }
            if (canClear) {
                c_result.text = ""
                c_expression.append(string)
            }
            else {
                c_expression.append(c_result.text)
                c_expression.append(string)
                c_result.text = ""
            }
        }
//            if (c_expression.text.length - 1() = "1" || "2" ) {
//                c_expression.text.length - 1
//                c_expression.text = "+"
}