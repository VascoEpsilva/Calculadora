package pt.upskill;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisaoTest {
    @org.junit.jupiter.api.Test
    void divisao() {
        Calculadora calc = new Calculadora();
        calc.digit1 = 10;
        calc.digit2 = 5;
        double expResult = 2;
        double actResult = calc.divisao(calc.digit1, calc.digit2);
        assertEquals(expResult, actResult, 0.0);
    }
}
