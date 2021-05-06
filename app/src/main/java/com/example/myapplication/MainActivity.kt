package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//еееее роккк
        main.setOnClickListener{ appendOnExpression("", true) }
        c_result.setOnClickListener{ appendOnExpression("", true) }
        c_expression.setOnClickListener{ appendOnExpression("", true) }
        //Числа
        c_one.setOnClickListener{ appendOnExpression("1", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_two.setOnClickListener{ appendOnExpression("2", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_three.setOnClickListener{ appendOnExpression("3", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_four.setOnClickListener{ appendOnExpression("4", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_five.setOnClickListener{ appendOnExpression("5", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_six.setOnClickListener{ appendOnExpression("6", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_seven.setOnClickListener{ appendOnExpression("7", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_eight.setOnClickListener{ appendOnExpression("8", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_nine.setOnClickListener{ appendOnExpression("9", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_zero.setOnClickListener{ appendOnExpression("0", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_dot.setOnClickListener{ appendOnExpression(".", true)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        //Операции
        c_plus.setOnClickListener{ appendOnExpression("+", false)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_minus.setOnClickListener{ appendOnExpression("-", false)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_multi.setOnClickListener{ appendOnExpression("*", false)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_div.setOnClickListener{ appendOnExpression("/", false)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_open.setOnClickListener{ appendOnExpression("(", false)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}
        c_close.setOnClickListener{ appendOnExpression(")", false)
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }}

        c_ac.setOnClickListener {
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }
            c_expression.text = ""
            c_result.text = ""
        }
        c_backspace.setOnClickListener{
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }
            val string = c_expression.text.toString()
            if (string.isNotEmpty()) {
                c_expression.text = string.substring(0, string.length - 1)
            }
            c_result.text = ""
        }
        c_equals.setOnClickListener {
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        it.rotationX = it.rotationX + 1
                        delay(1)

                    }
                }
            }

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
            MainScope().launch {
                for (i in 1..2) {
                    for (i in 0..89) {
                        c_result.rotationX = c_result.rotationX + 1
                        delay(1)
                    }

                    for (i in 90..179) {
                        c_result.rotationX = c_result.rotationX + 1
                        delay(1)

                    }
                }
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
        } else {
            c_expression.append(c_result.text)
            c_expression.append(string)
            c_result.text = ""
        }
    }


}
//            if (c_expression.text.length - 1() = "1" || "2" ) {
//                c_expression.text.length - 1
//                c_expression.text = "+"
