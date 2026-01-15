package dev.vladleesi.strings

class LengthLastWord {
    fun lengthOfLastWord(s: String): Int {
        var wl = 0
        var lwl = 0
        for (c in s) {
            if (c != ' ') {
                wl++
            } else {
                wl = 0
            }
            if (wl > 0) {
                lwl = wl
            }
        }
        return lwl
    }
}