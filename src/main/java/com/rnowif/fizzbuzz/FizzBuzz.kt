package com.rnowif.fizzbuzz

fun display(number: Int) = when {
    number.multipleOf(15) -> "fizzbuzz"
    number.multipleOf(3) -> "fizz"
    number.multipleOf(5) -> "buzz"
    else -> number.toString()
}

fun Int.multipleOf(number: Int): Boolean = this % number == 0