package dev.vladleesi

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        // Use the first string as the prefix reference
        val first = strs[0]
        // Iterate over each character index of the first string
        for (i in first.indices) {
            // Current character to match
            val c = first[i]
            // Compare with the same position in all other strings
            for (j in 1 until strs.size) {
                // Stop if string is too short or characters differ
                if (i >= strs[j].length || strs[j][i] != c) {
                    // Return prefix up to (but not including) current index
                    return first.take(i)
                }
            }
        }
        return first
    }
}