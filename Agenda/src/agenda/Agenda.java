package agenda;

/**
 *
 * @author Luís
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("João Paulo da Silva Cordeiro");
        p.setTelefone("+55 (45) 99960-6099");
        p.setIdade(45);
        
        System.out.println(p.mostrarDados());
        
        // Utilizando o constructor que aceita os argumentos
        Pessoa p1 = new Pessoa("Carlos Albert Silva", "(11)99594-4594", 21);
        System.out.println(p1.mostrarDados());
        
        // Utilizando o constructor de cópia
        Pessoa p2 = new Pessoa(p1);
        p2.setIdade(32);
        p2.setNome("Guilherme Henrique Barbosa");
        System.out.println(p2.mostrarDados());
    }
    
}
