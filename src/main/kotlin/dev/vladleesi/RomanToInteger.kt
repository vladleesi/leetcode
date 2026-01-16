package dev.vladleesi

class RomanToInteger {
    fun romanToInt(s: String): Int {
        var result = 0
        for (i in s.indices) {
            val current = value(s[i])
            val next = value(s.getOrNull(i + 1))
            result += if (current < next) -current else current
        }
        return result
    }

    private fun value(c: Char?) = when (c) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}