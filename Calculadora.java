public class Calculadora {

    public Calculadora() {}

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static double divisao(int a, int b) {
        return (double) a / b;
    }

    public String toString() {
        return "Calculadora{}";
    }
}

class Main1 {

    public static void main(String[] args) {
        int soma = Calculadora.soma(10, 5);
        int subtracao = Calculadora.subtracao(10, 5);
        int multiplicacao = Calculadora.multiplicacao(10, 5);
        double divisao = Calculadora.divisao(10, 5);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}