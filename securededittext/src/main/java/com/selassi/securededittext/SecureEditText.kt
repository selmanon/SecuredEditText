package com.selassi.securededittext

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText

class SecureEditText(context: Context, attrs: AttributeSet) : EditText(context, attrs) {
    private var mSecureString: SecureString =
        SecureString(CharArray(0));

    fun setSecuredText(secureString: SecureString) {
        mSecureString = secureString
        super.setText(text)
    }

    fun getSecuredText(): SecureString {
        return mSecureString;
    }
}