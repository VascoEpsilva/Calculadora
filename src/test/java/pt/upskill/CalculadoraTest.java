package pt.upskill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void subtração() {
    @Test
    void testePrimoNegativo() {

        Calculadora calc = new Calculadora();
        assertFalse(calc.ePrimo(-5));  // Números primos não podem ser negativos
    }

    @Test
    public void testePrimo0() {
        Calculadora calc = new Calculadora();
        assertFalse(calc.ePrimo(0));  // 0 não é número primo
    }

    @Test
    void testeePrimo1() {
        Calculadora calc = new Calculadora();
        assertFalse(calc.ePrimo(1));  // 1 não é número primo
    }

    @Test
    public void testePrimo2() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.ePrimo(2));  // 2 é número primo
    }

    // Teste com número primo 3
    @Test
    public void testePrimo3() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.ePrimo(3));  // 3 é número primo
    }
}