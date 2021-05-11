package com.example.myapplication


import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

try {
    val per = findViewById<Button>(R.id.perehod)
    per.setOnClickListener {
        val perehod = Intent(this, MainActivity2::class.java)
        startActivity(perehod)
    }

//еееее роккк
    main.setOnClickListener{ appendOnExpression("", true) }
    c_result.setOnClickListener{ appendOnExpression("", true) }
    c_expression.setOnClickListener{ appendOnExpression("", true) }
    //Числа
    c_one.setOnClickListener{ appendOnExpression("1", true)
        animate(it)
    }
    c_two.setOnClickListener{ appendOnExpression("2", true)
        animate(it)
    }
    c_three.setOnClickListener{ appendOnExpression("3", true)
        animate(it)
    }
    c_four.setOnClickListener{ appendOnExpression("4", true)
        animate(it)
    }
    c_five.setOnClickListener{ appendOnExpression("5", true)
        animate(it)
    }
    c_six.setOnClickListener{ appendOnExpression("6", true)
        animate(it)
    }
    c_seven.setOnClickListener{ appendOnExpression("7", true)
        animate(it)
    }
    c_eight.setOnClickListener{ appendOnExpression("8", true)
        animate(it)
    }
    c_nine.setOnClickListener{ appendOnExpression("9", true)
        animate(it)
    }
    c_zero.setOnClickListener{ appendOnExpression("0", true)
        animate(it)
    }
    c_dot.setOnClickListener{ appendOnExpression(".", true)
        animate(it)
    }
    //Операции
    c_plus.setOnClickListener{ appendOnExpression("+", false)
        animate(it)
    }
    c_minus.setOnClickListener{ appendOnExpression("-", false)
        animate(it)
    }
    c_multi.setOnClickListener{ appendOnExpression("*", false)
        animate(it)
    }
    c_div.setOnClickListener{ appendOnExpression("/", false)
        animate(it)
    }
    c_open.setOnClickListener{ appendOnExpression("(", false)
        animate(it)
    }
    c_close.setOnClickListener{ appendOnExpression(")", false)
        animate(it)
    }
    c_ac.setOnClickListener {
        animate(it)
        c_expression.text = ""
        c_result.text = ""
    }
    c_backspace.setOnClickListener{
        animate(it)
        val string = c_expression.text.toString()
        if (string.isNotEmpty()) {
            c_expression.text = string.substring(0, string.length - 1)
        }
        c_result.text = ""
    }
    c_equals.setOnClickListener {
        animate(it)
        try {
            val expression = ExpressionBuilder(c_expression.text.toString()).build()
            val result = expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble())
                c_result.text = longResult.toString()
            else
                c_result.text = result.toString()
        } catch (e: Exception) {
            Log.d("Exception", " message " + e.message)
        }
        animate(c_result)
    }
} catch (e: Exception) {
    Log.d("Exception", " message " + e.message)
}

    }

    fun appendOnExpression(string: String, canClear: Boolean) {
        if (c_result.text.isNotEmpty()) {
            c_expression.text = ""
        }
        if (canClear) {
            c_result.text = ""
            c_expression.append(string)
        } else {
            c_expression.append(c_result.text)
            c_expression.append(string)
            c_result.text = ""
        }
    }

    fun animate(view: View) {
        MainScope().launch {
            view.setBackgroundColor(Color.RED)
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
            view.setBackgroundColor(Color.BLACK)
        }
    }
}
//            if (c_expression.text.length - 1() = "1" || "2" ) {
//                c_expression.text.length - 1
//                c_expression.text = "+"