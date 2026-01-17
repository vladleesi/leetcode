package dev.vladleesi

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class PlusOneTest {

    @Test
    fun test() {
        val obj = PlusOne()
        assertArrayEquals(intArrayOf(1, 2, 4), obj.plusOne(intArrayOf(1, 2, 3)))
        assertArrayEquals(intArrayOf(4, 3, 2, 2), obj.plusOne(intArrayOf(4, 3, 2, 1)))
        assertArrayEquals(intArrayOf(1, 0), obj.plusOne(intArrayOf(9)))
    }
}