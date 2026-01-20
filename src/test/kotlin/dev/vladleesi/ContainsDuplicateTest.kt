package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainsDuplicateTest {

    @Test
    fun test() {
        val obj = ContainsDuplicate()
        assertTrue(obj.containsDuplicate(intArrayOf(1, 2, 3, 1)))
        assertFalse(obj.containsDuplicate(intArrayOf(1, 2, 3, 4)))
        assertTrue(obj.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
    }
}