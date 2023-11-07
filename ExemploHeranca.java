class animal {
    String nome;
    int Idade;

    public animal(String nome, int idade) {
        this.nome = nome;
        this.Idade = idade;

    }
    
    public void emitirSom() {
        System.out.println("Som genérico de um animal.");
    }
}

class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("Latido de um cachorro.");
    }
}

class Gato extends Animal {
    public void emitirSom() {
        System.out.println("Miado de um Gato.");
    }
}

public class ExemploHeranca {
    public static void main(String[] args) {
        
        Animal gato = new Gato();
        gato.nome = "Garfield";
        gato.Idade = 10;
        System.out.println("Nome Do Gato: Garfield"); // imprime o nome do gato Garfield, e coloca antes do Nome Do Cachorro ser chamado de Fiona No Terminal
        System.out.println("Idade Do Gato: 10");  // Fala a idade Do Gato No terminal vai ser Idade Do Gato: 10
        Animal cachorro = new Cachorro();
        cachorro.nome = "Fiona";
        cachorro.Idade = 9;
        System.out.println("Nome Do Cachorro: Fiona"); // Fala O nome Do Cachorro: Fiona, no Terminal.
        System.out.println("Idade Do Cachorro: 9"); // Fala A Idade Do Cachorro: 9.
    
        // Imprime os sons dos animais
        gato.emitirSom();
        cachorro.emitirSom();
    }
}