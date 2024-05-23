package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/calculator/plus")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/calculator/minus")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Деление на ноль невозможно";
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}