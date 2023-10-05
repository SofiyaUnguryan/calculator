package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    public final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Некорректный ввод, не хватает значений";
        } else {
            return number1 + " + " + number2 + " = " + calcService.addition(number1, number2);
        }
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Некорректный ввод, не хватает значений";
        } else {
            return number1 + " - " + number2 + " = " + calcService.subtraction(number1, number2);
        }
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Некорректный ввод, не хватает значений";
        } else {
            return number1 + " * " + number2 + " = " + calcService.multiplication(number1, number2);
        }
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Некорректный ввод, не хватает значений";
        } else if (number1 != 0 && number2 != 0) {
            return number1 + " / " + number2 + " = " + calcService.division(number1, number2);
        } else {
            return "На ноль делить нельзя!";
        }
    }
}
