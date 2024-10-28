import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        pessoa.nome = lerStringNaoVazia(scanner, "Digite seu nome: ");
        pessoa.idade = lerIdadeValida(scanner, "Digite sua idade: ");
        pessoa.email = lerStringNaoVazia(scanner, "Digite seu email: ");
        pessoa.cpf = lerStringNaoVazia(scanner, "Digite seu CPF: ");

        System.out.println(pessoa.exibirDados());
        scanner.close();
    }

    public static String lerStringNaoVazia(Scanner scanner, String mensagem) {
        String entrada;
        do {
            System.out.println(mensagem);
            entrada = scanner.nextLine();
            if (entrada.trim().isEmpty()) {
                System.out.println("Este campo não pode ficar em branco.");    
            }
        } while(entrada.trim().isEmpty());
        return entrada;
    }

    public static int lerIdadeValida(Scanner scanner, String mensagem) {
        int idade = -1;
        do {
            System.out.println(mensagem);
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                scanner.nextLine();
                if (idade < 0 || idade > 120) {
                    System.out.println("Por favor, digite uma idade valida");
                }
            }else {
                System.out.println("Por favor, digite sua idade");
                scanner.nextLine(); 
            }
        } while (idade <0 || idade > 120); {
        return idade;
        }
    }
}

