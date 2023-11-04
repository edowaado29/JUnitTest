package com.example.junittest

import org.junit.Test
import org.junit.Assert.assertEquals

class CalculatorTest {

    // menguji fungsi add() pada class Calculator
    @Test
    fun testAdd() {
        // inisialisasi objek calculator
        val calculator = Calculator()
        // menyimpan hasil dari fungsi add()
        val result = calculator.add(3, 4)
        // membandingkan hasil yang diharapkan dengan hasil actual dari fungsi yang diuji
        assertEquals(7, result)
    }

    // menguji fungsi subtract() pada class Calculator
    @Test
    fun testSubtract() {
        // insialisasi objek calculator
        val calculator = Calculator()
        // menyimpan hasil dari fungsi subtract()
        val result = calculator.subtract(8, 3)
        // membandingkan hasil yang diharapkan dengan hasil actual dari fungsi yang diuji
        assertEquals(5, result)
    }
}