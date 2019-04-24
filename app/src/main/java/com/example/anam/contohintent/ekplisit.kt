package com.example.anam.contohintent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ekplisit.*

class ekplisit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ekplisit)

        btn_move_activity.setOnClickListener {
            val intent = Intent(this, profil::class.java)
            startActivity(intent)
        }

        btn_move_activity_data.setOnClickListener {
            val intent = Intent(this, foto::class.java)
            intent.putExtra("Username", "Bedjo Banget")
            intent.putExtra("password", 1234567890)
            startActivity(intent)
        }

        btn_dial_number.setOnClickListener {
            val phoneNumber = "081327783279"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)



        }
        btn_move_for.setOnClickListener {
            val intent = Intent(this, jurusan::class.java)
            startActivity(intent)
        }
    }
}
