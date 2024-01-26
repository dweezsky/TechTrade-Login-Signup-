package com.example.techtrade

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity {

    private lateinit var et_user: EditText
    private lateinit var et_pw1: EditText
    private lateinit var et_pw2: EditText
    private lateinit var bt_confirm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        et_user = findViewById(R.id.et_user)
        et_pw1 = findViewById(R.id.et_pw1)
        et_pw2 = findViewById(R.id.et_pw2)
        bt_confirm = findViewById(R.id.bt_confirm)

        btconfirm2.setOnClickListener {
            Toast.makeText(this@SignUp,"Signup Successful", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
    }
}