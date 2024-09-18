package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/list")
    public String showCalculatorForm() {
        return "list";
    }

    @GetMapping("/result")
    public String calculateResult(@RequestParam double firstNumber,
                                  @RequestParam double secondNumber,
                                  @RequestParam String action,
                                  Model model) {
        double result = 0;
        String operatorSymbol = "";

        switch (action) {
            case "add":
                result = firstNumber + secondNumber;
                operatorSymbol = "+";
                break;
            case "subtract":
                result = firstNumber - secondNumber;
                operatorSymbol = "-";
                break;
            case "multiply":
                result = firstNumber * secondNumber;
                operatorSymbol = "*";
                break;
            case "divide":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    operatorSymbol = "/";
                } else {
                    model.addAttribute("error", "Không thể chia cho 0!");
                    return "list";
                }
                break;
            default:
                return "list";
        }

        model.addAttribute("firstNumber", firstNumber);
        model.addAttribute("secondNumber", secondNumber);
        model.addAttribute("operatorSymbol", operatorSymbol);
        model.addAttribute("result", result);

        return "result";
    }
}
