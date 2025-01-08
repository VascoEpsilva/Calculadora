package pt.upskill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


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

    @Test
    public void testFatorialPositivo() {
        // Testa o cálculo do fatorial de 5
        Calculadora fatorial = new Calculadora();
        assertEquals(120, Calculadora.fatorial(5), "Fatorial de 5 deveria ser 120");
    }

    @Test
    public void testFatorialZero() {
        // Testa o cálculo do fatorial de 0
        Calculadora fatorial = new Calculadora();
        assertEquals(0, Calculadora.fatorial(0), "Fatorial de 0 deveria ser 0 (segundo o seu código)");
    }

    @Test
    public void testFatorialNegativo() {
        // Testa quando o valor de entrada é negativo
        Calculadora fatorial = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> fatorial.fatorial(-1),
                "Deveria lançar uma exceção para números negativos");
    }

    @Test
    public void testFatorialDe1() {
        // Testa o cálculo do fatorial de 1
        Calculadora fatorial = new Calculadora();
        assertEquals(1, Calculadora.fatorial(1), "Fatorial de 1 deveria ser 1");
    }

    @Test
    public void testFatorialDeGrandeNumero() {
        // Testa o cálculo de um número grande (exemplo: 20)
        Calculadora fatorial = new Calculadora();
        assertEquals(2432902008176640000L, Calculadora.fatorial(20), "Fatorial de 20 deveria ser 2432902008176640000");
    }
}
