import java.util.Scanner;

public class Main {

	// Declaração de variáveis do método inicializador;
//	private String nome;
//	private String endereco;
//	private String numero_endereco;
//	private String bairro;
//	private String cidade;
//	private String estado;
//	private String uf;
//	private String cep;
//	private String cnpj;
//	private String cpf;
//	private String fabricante;
//	private String modelo_central;
//	private String qtd_placa_ramal_analogico;
//	private String qtd_placa_ramal_digital;
//	private String qtd_tronco_analogico;
//	private String qtd_tronco_digital;

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		char opcao_escolhida;
		Cliente cliente1;
		

		// Entrada das opções para o usuário
		System.out.println("Digite \n N: para novo cadastro: \n E: para exibir um cliente cadastrado");
		opcao_escolhida = leitura.next().toUpperCase().toCharArray()[0];

		while (opcao_escolhida == 'N' || opcao_escolhida == 'E') {
			// Switch case para chamados os métodos dependendo da opção escolhida pelo
			// usuário.
			switch (opcao_escolhida) {
			case 'N':
				// chamar cadastro de novo cliente;
				cliente1 = new Cliente();
				cliente1.cadastrar(leitura);
				
				
				opcao_escolhida = ' ';
				break;

			case 'E':
				System.out.println("Qual o código do cliente que deseja exibir:");
				// Campo para o usuário digitar o código que deseja procurar e chamar método
				// para buscar e exibir cliente;

			default:
				System.out.println("Digite uma opção válida.");
			}
		}

		/*
		 * System.out.println("Digite seu nome: "); nome = leitura.nextLine();
		 * 
		 * System.out.println("Digite seu endereço: "); endereco = leitura.nextLine();
		 * 
		 * System.out.println("Digite o número do endereço: "); numero_endereco =
		 * leitura.nextLine();
		 * 
		 * System.out.println("Digite o bairro: "); bairro = leitura.nextLine();
		 * 
		 * System.out.println("Digite a cidade: "); cidade = leitura.nextLine();
		 * 
		 * System.out.println("Digite o estado: "); estado = leitura.nextLine();
		 * 
		 * System.out.println("Digite a UF: "); uf = leitura.nextLine();
		 * 
		 * System.out.println("Digite o CEP: "); cep = leitura.nextLine();
		 * 
		 * System.out.println("Digite o cnpj: "); cnpj = leitura.nextLine();
		 * 
		 * System.out.println("Digite o cpf: "); cpf = leitura.nextLine();
		 */

	}

}
