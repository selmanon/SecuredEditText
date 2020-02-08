package com.selassi.securededittextsample

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText

class SecureEditText(context: Context, attrs : AttributeSet) : EditText(context, attrs) {
    private var mSecureString : SecureString = SecureString("".toCharArray());

    fun getSecureText(): SecureString {
        return mSecureString;
    }

    fun setSecureText(secureString: SecureString) {
        mSecureString = secureString
        super.setText(secureString)
    }
}