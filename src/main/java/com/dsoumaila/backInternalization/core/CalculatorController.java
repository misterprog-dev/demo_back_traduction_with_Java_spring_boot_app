package com.dsoumaila.backInternalization.core;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CalculatorController {

    @GetMapping("calculator")
    ResponseEntity<Integer> calculate(@RequestBody CalculatorDto calculatorDto) throws Exception {
        Calculator calculator = new Calculator(calculatorDto.getFirstNumber(), calculatorDto.getSecondNumber());
        switch (calculatorDto.getOperator()) {
            case "+":
                return ResponseEntity.ok(calculator.sum());
            case "-":
                return ResponseEntity.ok(calculator.minus());
            case "*":
                return ResponseEntity.ok(calculator.multiply());
            case "/":
                return ResponseEntity.ok(calculator.divide());
            default:
                throw new Exception("operation.unknown");
        }
    }
}
