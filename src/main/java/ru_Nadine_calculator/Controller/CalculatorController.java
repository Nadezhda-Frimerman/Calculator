package ru_Nadine_calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru_Nadine_calculator.Service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String getHello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String getPlus(@RequestParam(value = "num1") Double num1,
                          @RequestParam(value = "num2") Double num2) {
        return num1 + " + " + num2 + "=" + calculatorService.getSummary(num1, num2);

    }

    @GetMapping(path = "/minus")
    public String getMinus(@RequestParam(value = "num1") Double num1,
                           @RequestParam(value = "num2") Double num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getSubtraction(num1, num2);

    }

    @GetMapping(path = "/multiply")
    public String getMultiply(@RequestParam(value = "num1") Double num1,
                              @RequestParam(value = "num2") Double num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getMultiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String getDivide(@RequestParam(value = "num1") Double num1,
                            @RequestParam(value = "num2") Double num2) {
        return num1 + " / " + num2 + " = " + calculatorService.getDivision(num1, num2);
    }

}
