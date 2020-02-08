package com.selassi.securededittext

import android.content.Context
import android.widget.EditText

class SecureEditText(context: Context?) : EditText(context) {

    private var mSecureString : SecureString = SecureString("".toCharArray());

    fun getSecureText(): SecureString {
        return mSecureString;
    }

    fun setSecureText(secureString: SecureString) {
        mSecureString = secureString
        invalidate()
        requestLayout()
    }
}