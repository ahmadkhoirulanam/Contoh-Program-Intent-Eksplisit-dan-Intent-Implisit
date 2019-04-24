package com.example.anam.contohintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_implisit.setOnClickListener {
            val intent = Intent(this, implisit::class.java)
            startActivity(intent)}

        btn_ekplisit.setOnClickListener {
            val intent = Intent(this, ekplisit::class.java)
            startActivity(intent)}
    }
}
