package pt.upskill;

import java.util.Scanner;

public class Interface {

    private pt.upskill.Calculadora calculadora;
    private Scanner ler;

    public Interface(){
        this.calculadora = new pt.upskill.Calculadora();
        this.ler = new Scanner(System.in);
    }

    public void Initialize(){

        boolean working = true;

        System.out.println("-------------Calculadora Scrum-------------");

        do {
            System.out.println("Escolha a operação a realizar:");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("5- Potência");
            System.out.println("6- Fatorial");
            System.out.println("7- Verificar se é primo");
            System.out.println("8- Verificar se é a soma dos cubos dos dígitos que o compõem");
            System.out.println("9- Converter de decimal para binário");
            System.out.println("10- Converter de binário para decimal");
            System.out.println("11- Converter de decimal para hexadecimal");
            System.out.println("-1- Fechar");

            int op = ler.nextInt();

            switch (op) {
                case (1):
                    askTwoDigits();
                    System.out.println(calculadora.digit1 + "+" + calculadora.digit2 + "=" + calculadora.soma(calculadora.digit1, calculadora.digit2));
                    break;
                case (2):
                    askTwoDigits();
                    System.out.println(calculadora.digit1 + "-" + calculadora.digit2 + "=" + calculadora.subtracao(calculadora.digit1, calculadora.digit2));
                    break;
                case (3):
                    askTwoDigits();
                    System.out.println(calculadora.digit1 + "*" + calculadora.digit2 + "=" + calculadora.multiplicacao(calculadora.digit1, calculadora.digit2));
                    break;
                case (4):
                    askTwoDigits();
                    if(calculadora.digit2 == 0)
                        System.out.println(calculadora.digit1 + "/" + calculadora.digit2 + "\nError: Calculo Impossível");
                    else
                        System.out.println(calculadora.digit1 + "/" + calculadora.digit2 + "=" + calculadora.divisao(calculadora.digit1, calculadora.digit2));
                    break;
                case (5):
                    askTwoDigits();
                    System.out.println(calculadora.digit1 + "^" + calculadora.digit2 + "=" + calculadora.potencia(calculadora.digit1, calculadora.digit2));
                    break;
                case (6):
                    askOneDigit();
                    System.out.println(calculadora.digit1 + "!" + "=" + calculadora.fatorial(((int) calculadora.digit1)));
                    break;
                case (7):
                    askOneDigit();
                    break;
                case (8):
                    askOneDigit();
                    int numero = (int) calculadora.digit1;
                    if (calculadora.isSomaCubosDosDigitos(numero)) {
                    System.out.println(calculadora.digit1 + " é igual à soma dos cubos dos seus dígitos.");
                    } else {
                    System.out.println(calculadora.digit1 + " não é igual à soma dos cubos dos seus dígitos.");
                     }
                    break;
                case (9):
                    askOneDigit();
                    System.out.println(Integer.toBinaryString((int)calculadora.digit1));
                    break;
                case (10):
                    String bin = askBinary();
                    if(bin.matches("[10]*"))
                        System.out.println(Integer.parseInt(bin, 2));
                    else
                        System.out.println("Error: Conversão Impossível. \nNúmero introduzido não é binário.");
                    break;
                case (11):
                    askOneDigit();
                    System.out.println(Integer.toHexString((int)calculadora.digit1));
                    break;
                case (-1):
                    working = false;
                    break;
                default:
                    System.out.println("Opção introduzida é inválida!");
            }
            System.out.println("---------------------------------------------------------------");
        }while(working);
    }

    public void askTwoDigits(){
        System.out.println("Insere o primeiro número:");
        calculadora.digit1 = ler.nextDouble();
        System.out.println("Insere o segundo número:");
        calculadora.digit2 = ler.nextDouble();
    }

    public void askOneDigit(){
        System.out.println("Insere um número:");
        calculadora.digit1 = ler.nextDouble();
    }

    public String askBinary(){
        ler.nextInt();
        System.out.println("Insere o número binário:");
        return ler.nextLine();
    }
}
