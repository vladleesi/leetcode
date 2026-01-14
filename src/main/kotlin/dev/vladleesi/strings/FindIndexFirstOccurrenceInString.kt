package dev.vladleesi.strings

class FindIndexFirstOccurrenceInString {
    fun strStr(haystack: String, needle: String): Int {
        // Legal cheat
        // return haystack.indexOf(needle)

        if (needle.length > haystack.length) return -1

        for (i in haystack.indices) {
            if (haystack[i] == needle[0] && needle.length <= haystack.length - i) {
                var count = 0
                for (j in needle.indices) {
                    if (needle[j] == haystack[i + j]) {
                        count++
                    }
                }
                if (needle.length == count) return i
            }
        }
        return -1
    }
}