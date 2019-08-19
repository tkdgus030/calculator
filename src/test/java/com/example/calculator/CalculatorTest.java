package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    @Test
    public void test_양수덧셈(){
        Calculator calc = new Calculator();
        int result =  calc.add(5, 4);
        assertEquals("add 함수의 결과는 9이어야함", 9, result);
    }

    @Test
    public void test_음수덧셈() {
        Calculator calc = new Calculator();
        int result =  calc.add(-5, -4);
        assertEquals("add 함수의 결과는 9이어야함", -9, result);
    }
    @Test
    public void test_양수덧셈2(){
        Calculator calc = new Calculator();
        int result =  calc.add(5, 4);
        assertNotEquals( 0, result);
    }
    @Test
    public void test_정수나누셈(){
        Calculator calc = new Calculator();
        int result = calc.divide(10,5);
        assertEquals(2,result);
    }
    @Test
    public void test_실수나누셈() {
        Calculator calc = new Calculator();
        double result = calc.divide(10.0,4.0);
        assertEquals(2.5,result);
    }
    @Test(expected = ArithmeticException.class)
    public void test_0으로나누기() {    //100% error
        Calculator calc = new Calculator();
        int result = calc.divide(10,0);
        assertEquals(0,result);
    }
    @Test
    public void test_양수뺄셈() {
        Calculator calc = new Calculator();
        double result = calc.divide(5,4);
        assertEquals("두뺼셈의 차는 1이어야함.",  1,result);
    }
    @Test
    public void test_양수곱셈() {
        Calculator calc = new Calculator();
        double result = calc.add(5,4);
        assertEquals("두곱셈의 값은 20이어야함.", 20,result);
    }

}
