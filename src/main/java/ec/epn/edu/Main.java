package ec.epn.edu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        CalculatorService calculatorService = new CalculatorServiceImpl();

        // Crear una instancia de la calculadora
        Calculator calculator = new Calculator(calculatorService);

        // Usar los métodos de la calculadora
        System.out.println(calculator.sumar(3, 4));        // Imprime: 7
        System.out.println(calculator.restar(5, 2));       // Imprime: 3
        System.out.println(calculator.multiplicar(2, 6));  // Imprime: 12
        System.out.println(calculator.dividir(10, 5));     // Imprime: 2.0
        System.out.println(calculator.dividir(8, 0));      // Lanza una excepción: ArithmeticException
    }

}