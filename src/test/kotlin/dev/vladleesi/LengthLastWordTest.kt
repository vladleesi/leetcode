package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class LengthLastWordTest {

    @Test
    fun test() {
        val obj = LengthLastWord()
        assertEquals(5, obj.lengthOfLastWord("Hello World"))
        assertEquals(4, obj.lengthOfLastWord("   fly me   to   the moon  "))
        assertEquals(6, obj.lengthOfLastWord("luffy is still joyboy"))
        assertEquals(3, obj.lengthOfLastWord("Today is a nice day"))
    }
}