package com.example.ordemgalerial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val trans = findViewById<ImageButton>(R.id.agatha)

        trans.setOnClickListener {

            val sangue = Intent(this, Agatha::class.java)
            startActivity(sangue)

            val eres = findViewById<ImageButton>(R.id.gal)

            eres.setOnClickListener {

                val sal = Intent(this, Gal::class.java)
                startActivity(sal)

                val thigas = findViewById<ImageButton>(R.id.thiago)

                thigas.setOnClickListener {

                    val frit = Intent(this, Thiago_fritz::class.java)
                    startActivity(frit)

                    val chris = findViewById<ImageButton>(R.id.chris)

                    chris.setOnClickListener {

                        val cohen = Intent(this, Chris_Tela::class.java)
                        startActivity(cohen)

                        val batata = findViewById<ImageButton>(R.id.kaiser)

                        batata.setOnClickListener {

                            val cu = Intent(this, Kaiser_Tela::class.java)
                            startActivity(cu)


                            val liz = findViewById<ImageButton>(R.id.liz)

                            liz.setOnClickListener {

                                val webber = Intent(this, Liz::class.java)
                                startActivity(webber)
                            }

                        }

                    }
                }
            }
        }
    }
}