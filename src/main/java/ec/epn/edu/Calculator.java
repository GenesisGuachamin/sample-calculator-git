package ec.epn.edu;

public class Calculator {
    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int sumar(int num1, int num2) {
        return calculatorService.sumar(num1, num2);
    }

    public int restar(int num1, int num2) {
        return calculatorService.restar(num1, num2);
    }

    public int multiplicar(int num1, int num2) {
        return calculatorService.multiplicar(num1, num2);
    }

    public double dividir(int num1, int num2) {
        return calculatorService.dividir(num1, num2);
    }
}


