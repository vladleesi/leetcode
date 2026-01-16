package dev.vladleesi

import java.util.Stack
import kotlin.text.iterator

class ValidParentheses {
    fun isValid(s: String): Boolean {
        if (s.length < 2) return false

        val stack = Stack<Char>()
        for (c in s) {
            when (c) {
                '(', '{', '[' -> stack.push(c)
                ')', '}', ']' -> {
                    val l = stack.getOrNull(stack.lastIndex) ?: return false
                    when {
                        l == '(' && c == ')' -> stack.pop()
                        l == '{' && c == '}' -> stack.pop()
                        l == '[' && c == ']' -> stack.pop()
                        else -> return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}