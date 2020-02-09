package com.selassi.securededittextsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.selassi.securededittext.SecureEditText
import com.selassi.securededittext.SecureString

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val securedEditText = findViewById<SecureEditText>(R.id.password)
        securedEditText.setSecuredText(SecureString("Secured Password!".toCharArray()))
        System.out.println("from main : ${securedEditText.getSecuredText()}")

    }
}
