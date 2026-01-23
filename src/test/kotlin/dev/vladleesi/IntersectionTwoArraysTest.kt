package dev.vladleesi

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class IntersectionTwoArraysTest {

    @Test
    fun test() {
        val obj = IntersectionTwoArrays()
        assertArrayEquals(intArrayOf(2), obj.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)))
        assertArrayEquals(intArrayOf(4, 9), obj.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)))
    }
}