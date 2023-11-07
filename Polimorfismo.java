public class Polimorfismo {

  public static void main(String[] args) {

    // Cria um objeto da classe Retangulo
    Retangulo retangulo = new Retangulo(10, 20);

    // Cria um objeto da classe Circulo
    Circulo circulo = new Circulo(5);

    // Imprime as áreas das formas geométricas
    System.out.println("A área do retângulo é: " + retangulo.calcularArea());
    System.out.println("A área do círculo é: " + circulo.calcularArea());

  }
}