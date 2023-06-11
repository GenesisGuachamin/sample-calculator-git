package ec.epn.edu;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double dividir(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new ArithmeticException("Error: No se puede dividir por cero.");
        }
    }
}