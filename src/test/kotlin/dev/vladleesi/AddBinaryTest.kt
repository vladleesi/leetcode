package dev.vladleesi

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AddBinaryTest {

    @Test
    fun test() {
        val obj = AddBinary()
        assertEquals("100", obj.addBinary(a = "11", b = "1"))
        assertEquals("10101", obj.addBinary(a = "1010", b = "1011"))
    }
}