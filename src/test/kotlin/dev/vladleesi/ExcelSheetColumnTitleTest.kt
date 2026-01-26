package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class ExcelSheetColumnTitleTest {

    @Test
    fun test() {
        val obj = ExcelSheetColumnTitle()
        assertEquals("A", obj.convertToTitle(columnNumber = 1))
        assertEquals("AB", obj.convertToTitle(columnNumber = 28))
        assertEquals("ZY", obj.convertToTitle(columnNumber = 701))
    }
}