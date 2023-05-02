package pro.sky.aelitacalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) throws Exception {
       if(b == 0) throw new Exception("Нельзя делить на 0");
           return a / b;

       }
    }

