package Rikkei.academy.Test;


import Rikkei.academy.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void testCalculatorAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;
        int result = Calculator.calculator(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculatorSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;
        int result = Calculator.calculator(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculatorMul() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;
        int result = Calculator.calculator(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculatorDiv() {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;
        int result = Calculator.calculator(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculatorDivByZero() {
        int a = 2;
        int b = 0;
        char o = '/';
        assertThrows(RuntimeException.class,()->{Calculator.calculator(a,b,o);});
    }
    @Test
    @DisplayName("Testing wrong operator")
    void testCaculatorWrongOperator(){
        int a =2;
        int b= 0;
        char o = '=';
        assertThrows(RuntimeException.class,()->{Calculator.calculator(a,b,o);});
    }


}
