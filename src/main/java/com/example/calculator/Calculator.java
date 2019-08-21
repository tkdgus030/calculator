package com.example.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (AbstractMethodError ex) {
            throw new ArithmeticException("0으로 나눌수 없다");
        }
    }
    public double divide(double a, double b) {
        return a / b;
    }

    public int subtract(int a, int b){
        return a - b ;
    }
}

