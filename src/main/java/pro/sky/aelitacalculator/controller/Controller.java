package pro.sky.aelitacalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.aelitacalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String Hello(){
      return calculatorService.hello();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam("a")int a, @RequestParam("b")int b){
        return "" + calculatorService.plus(a, b);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("a")int a, @RequestParam("b")int b){
        return "" + calculatorService.minus(a, b);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("a")int a, @RequestParam("b")int b){
        return "" + calculatorService.multiply(a, b);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("a")int a, @RequestParam("b")int b) throws Exception {
        return "" + calculatorService.divide(a, b);
    }
}
