public class Pessoa { 
    public String nome;
    public int idade;
    public String email;
    public String cpf;

    public String exibirDados() {
        return "=== Dados de Pessoas ===\n" +
               "Nome: " + this.nome + "\n" +
               "Idade: " + this.idade + "\n" +
               "Email: " + this.email + "\n" +
               "CPF: " + this.cpf;
    }
}
