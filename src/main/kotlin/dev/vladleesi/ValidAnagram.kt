package dev.vladleesi

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        // 26 is number of letters in the English alphabet
        val count = IntArray(26)

        for (c in s) {
            // Map character to index:
            // 'a' - 'a' -> 0, 'n' - 'a' -> 13, ..., 'z' - 'a' -> 25
            count[c - 'a']++
        }

        for (c in t) {
            val index = c - 'a'
            count[index]--

            // Negative means t uses a letter more times than s
            if (count[index] < 0) return false
        }

        return true
    }
}