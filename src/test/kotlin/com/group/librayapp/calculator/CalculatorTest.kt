package com.group.librayapp.calculator

import com.group.libraryapp.calculator.Calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
}

class CalculatorTest {
    fun addTest() {
        val calculator = Calculator(5)
        calculator.add(3)

        val expectedCalculator = Calculator(8)
        if (calculator != expectedCalculator) {
            throw IllegalArgumentException()
        }
    }
}