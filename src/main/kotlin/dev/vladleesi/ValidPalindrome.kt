package dev.vladleesi

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val formatted = StringBuilder()
        for (c in s) {
            if (c.isLetterOrDigit()) {
                formatted.append(c.lowercaseChar())
            }
        }
        for (i in 0 until formatted.length) {
            if (formatted[i] != formatted[formatted.lastIndex - i]) {
                return false
            }
        }
        return true
    }
}