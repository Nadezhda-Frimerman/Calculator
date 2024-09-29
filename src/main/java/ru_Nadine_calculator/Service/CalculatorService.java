package ru_Nadine_calculator.Service;

import org.springframework.stereotype.Service;

import java.text.Format;

@Service
public class CalculatorService {
    public Double getSummary(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Аргумент не передан");
        }
        return num1 + num2;
    }

    public Double getSubtraction(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Аргумент не передан");
        }
        return num1 - num2;
    }

    public Double getMultiplication(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Аргумент не передан");
        }
        return num1 * num2;
    }

    public Double getDivision(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Аргумент не передан");
        }
        if (num2 == 0.0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return num1 / num2;
    }
}
