package pt.upskill;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void subtracao() {
        Calculadora calc = new Calculadora();
        calc.digit1 = 10;
        calc.digit2 = 5;
        double expResult = 5;
        double actResult = calc.subtracao(calc.digit1, calc.digit2);
        assertEquals(expResult, actResult, 0.0);
    }
}