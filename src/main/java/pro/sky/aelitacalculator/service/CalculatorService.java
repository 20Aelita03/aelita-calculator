package pro.sky.aelitacalculator.service;

public interface CalculatorService {
    String hello();
    int plus(int a, int b);
    int minus(int a, int b);
    int multiply(int a, int b);
    double divide(int a, int b) throws Exception;
}
