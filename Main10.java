    class Pessoa {
    public void saudacao() {
        System.out.println("Olá!");
    }
}

class Estudante extends Pessoa {
    public void saudacao() {
        System.out.println("Olá, eu sou um estudante!");
    }
}

public class Main10 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Estudante estudante = new Estudante();

        pessoa.saudacao();    // Isso imprimirá "Olá!"
        estudante.saudacao();  // Isso imprimirá "Olá, eu sou um estudante!"
    }
}
