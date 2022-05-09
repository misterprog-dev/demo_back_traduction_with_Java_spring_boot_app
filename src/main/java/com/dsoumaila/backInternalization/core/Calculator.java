package com.dsoumaila.backInternalization.core;

public class Calculator {
    private Integer firstNumber;
    private Integer secondNumber;

    public Calculator(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Integer sum() {
        return this.firstNumber + this.secondNumber;
    }

    public Integer minus() {
        return this.firstNumber - this.secondNumber;
    }

    public Integer multiply() {
        return this.firstNumber * this.secondNumber;
    }

    public Integer divide() {
        if(this.secondNumber == 0) throw new ArithmeticException("operation.divide.error");
        return this.firstNumber / this.secondNumber;
    }
}
