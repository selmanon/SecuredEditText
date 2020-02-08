package com.selassi.securededittextsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val securedEditText = findViewById<SecureEditText>(R.id.password)
        securedEditText.setSecureText(SecureString("Secured Password!".toCharArray()))
        System.out.println(securedEditText.getSecureText())

    }
}
