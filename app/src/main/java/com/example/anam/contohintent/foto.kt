package com.example.anam.contohintent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_foto.*
import kotlinx.android.synthetic.main.activity_implisit.*

class foto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foto)
        btn_fb.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.facebook.com/")
            startActivity(intent)
        })

        btn_ig.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.instagram.com/")
            startActivity(intent)
        })

        btn_tw.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.twitter.com/")
            startActivity(intent)
        })
        btn_you.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/")
            startActivity(intent)
        })

}}
