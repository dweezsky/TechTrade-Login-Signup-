package com.example.techtrade

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignIn : AppCompatActivity() {
    private lateinit var emailET: EditText
    private lateinit var passET: EditText
    private lateinit var btn_signin: Button
    private lateinit var btn_signup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(300)
        installSplashScreen()

        setContentView(R.layout.signin_activity)
        emailET = findViewById(R.id.emailEt)
        passET = findViewById(R.id.passET)
        btn_signin = findViewById(R.id.btn_signin)
        btn_signup = findViewById(R.id.btn_signup)

        mybt.setOnClickListener {
            val username = etEm.text.toString()
            val password = etPw.text.toString()

            if (username == "admin") {
                if (password == "123") {
                    Toast.makeText(this@SignIn,"Login Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@SignIn, HomeActivity::class.java)
                    startActivity(intent)
                }
            }
            else {
                Toast.makeText(this@SignIn, "Login Failed: Invalid Credentials", Toast.LENGTH_SHORT).show()
            }

            btsu.setOnClickListener {
                Toast.makeText(this@SignIn,"Create Account", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SignUp::class.java)
                startActivity(intent)
            }
        }
    }
}

}