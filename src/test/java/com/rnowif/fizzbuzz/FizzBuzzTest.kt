package com.rnowif.fizzbuzz

import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals

class FizzBuzzTest : Spek ({
    describe("Test for FizzBuzz") {
        it("should display the number as a string") {
            assertEquals("1", display(1))
        }

        it("should display fizz when multiple of 3") {
            assertEquals("fizz", display(3))
        }

        it("should display buzz when multiple of 5") {
            assertEquals("buzz", display(5))
        }

        it("should display fizzbuzz when multiple of 15") {
            assertEquals("fizzbuzz", display(15))
        }
    }
})