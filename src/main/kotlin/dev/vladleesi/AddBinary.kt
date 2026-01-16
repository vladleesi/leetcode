package dev.vladleesi

class AddBinary {
    fun addBinary(a: String, b: String): String {
        var carry = 0
        val result = StringBuilder()
        val n = a.length.coerceAtLeast(b.length)

        for (i in 0 until n) {
            val x = if (i < a.length) a[a.lastIndex - i] - '0' else 0
            val y = if (i < b.length) b[b.lastIndex - i] - '0' else 0

            val sum = x + y + carry
            // Examples:
            // sum = 0 -> write 0, carry 0
            // sum = 1 -> write 1, carry 0
            // sum = 2 -> write 0, carry 1  (1 + 1 = 10)
            // sum = 3 -> write 1, carry 1  (1 + 1 + 1 = 11)
            result.append(sum % 2) // take the last (rightmost) binary digit
            carry = sum / 2 // take the carry (overflow) to the next position
        }

        if (carry == 1) result.append(1)

        return result.reversed().toString()
    }
}