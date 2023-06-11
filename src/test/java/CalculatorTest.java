import ec.epn.edu.Calculator;
import ec.epn.edu.CalculatorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CalculatorTest {

    @Mock
    private CalculatorService calculatorService;

    private Calculator calculator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        calculator = new Calculator(calculatorService);
    }

    @Test
    public void testSumar() {
        Mockito.when(calculatorService.sumar(3, 4)).thenReturn(7);
        int resultado = calculator.sumar(3, 4);
        Assert.assertEquals(7, resultado);
    }

    @Test
    public void testRestar() {
        Mockito.when(calculatorService.restar(5, 2)).thenReturn(3);
        int resultado = calculator.restar(5, 2);
        Assert.assertEquals(3, resultado);
    }

    @Test
    public void testMultiplicar() {
        Mockito.when(calculatorService.multiplicar(2, 6)).thenReturn(12);
        int resultado = calculator.multiplicar(2, 6);
        Assert.assertEquals(12, resultado);
    }

    @Test
    public void testDividir() {
        Mockito.when(calculatorService.dividir(10, 5)).thenReturn(2.0);
        double resultado = calculator.dividir(10, 5);
        Assert.assertEquals(2.0, resultado, 0.001);
    }
}
