package com.selassi.securededittextsample

import java.util.*

class SecureString(value: CharArray?) : CharSequence {
    @Transient
    private val value: CharArray

    init {
        requireNotNull(value) { "Value must not be null" }
        this.value = value
    }

    override val length: Int
        get() = value.size

    override fun get(index: Int): Char = value[index]

    override fun subSequence(start: Int, end: Int): CharSequence {
        throw UnsupportedOperationException()
    }

    fun clear() {
        Arrays.fill(value, '\u0000')
    }

    fun toCharArray(): CharArray {
        return value
    }

}
