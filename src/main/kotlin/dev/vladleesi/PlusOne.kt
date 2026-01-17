package dev.vladleesi

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.lastIndex downTo 0) {
            // Increment digit if no carry is needed
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            // Handle carry: set digit to 0 and continue left
            digits[i] = 0
        }
        // All digits were 9, add leading 1 ([9, 9] -> [1, 0, 0])
        return IntArray(digits.size + 1).also { it[0] = 1 }
    }
}