package pt.upskill;

public class Calculadora {

    public double resultado;
    public double digit1;
    public double digit2;

    public Calculadora() {
    }

    public double soma(double d1, double d2) {
        return (d1 + d2);
    }

    public double multiplicacao(double d1, double d2) {
        return (d1 * d2);
    }

    public double subtracao(double d1, double d2) {
        return (d1 - d2);
    }

    public double divisao(double d1, double d2) {
        return (d1 / d2);
    }

    public double potencia(double x, double y) {
        double res = 1;

        if(y > 0) {
            for (int i = 0; i < y; i++) {
                res = res * x;
            }
            return res;
        }
        else if(y < 0) {
            for (int i = 0; i > y; i--) {
                res = res * x;
            }
            return res;
        }
        else
            return 1;
    }

    public double fatorial(int x) {
        double res = 1;
        if(x < 0)
            throw new IllegalArgumentException("Não é possível calcular o fatorial deste número");
        if(x == 0)
            return 0;
        for(int i = x; i != 1; i--)
            res = res * i;
        return res;
    }

    public boolean ePrimo(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean isSomaCubosDosDigitos(int numero) {
        int soma = 0;
        int original = numero;

        while (numero > 0) {
            int digito = numero % 10;
            soma += (int) Math.pow(digito, 3);
            numero /= 10;
        }

        return soma == original;
    }
}
