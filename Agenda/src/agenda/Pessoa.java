package agenda;

/**
 *
 * @author Luís
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private int idade;
    
    public Pessoa() {
        this("", "", 0);
    }
    
    public Pessoa(String nome, String telefone, int idade) {
        this.idade = idade;
        this.nome = nome;
        this.telefone = telefone;                
    }
    
    public Pessoa(Pessoa p) {
        this(p.getNome(), p.getTelefone(), p.getIdade());
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    public boolean testeIdade(int idade) {
        return (idade >= 0) ? true : false;
    }
    
    public String mostrarDados() {
        return "Nome: " + nome + " Telefone: " + telefone + " Idade: " + idade;
    }
}
