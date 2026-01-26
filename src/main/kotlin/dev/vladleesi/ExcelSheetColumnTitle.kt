package dev.vladleesi

class ExcelSheetColumnTitle {
    fun convertToTitle(columnNumber: Int): String {
        var n = columnNumber
        val result = StringBuilder()

        while (n > 0) {
            // Excel columns are 1..26 ('A'...'Z'),
            // but characters are 0..25 ('A'...'Z'),
            // so we shift to 0-based indexing
            n--
            // Take the last "digit" in base-26
            // 0 -> 'A', 1 -> 'B', ..., 25 -> 'Z'
            result.append('A' + n % 26)
            // Move to the next letter position (to the left)
            n /= 26
        }

        return result.reversed().toString()
    }
}