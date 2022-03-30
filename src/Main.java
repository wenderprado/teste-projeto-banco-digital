import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o nome:");
		
		Cliente cliente = new Cliente();
		String Nome = input.nextLine();
		cliente.setNome(Nome);
		System.out.printf("O nome do cliente é: %s%n%n", cliente.getNome());
		
		
		System.out.println("Entre com o cpf:");
		
		
		String Cpf = input.nextLine();
		cliente.setCpf(Cpf);
		System.out.printf("O cpf do cliente é: %s%n%n", cliente.getCpf());
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);
				
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
