package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class RemoveElementTest {

    @Test
    fun test() {
        val obj = RemoveElement()
        assertEquals(2, obj.removeElement(intArrayOf(3, 2, 2, 3), 3))
        assertEquals(5, obj.removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
    }
}