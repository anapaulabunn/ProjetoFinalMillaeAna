import java.util.Scanner;

public class Main {

	// Declara��o de vari�veis do m�todo inicializador;
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
		

		// Entrada das op��es para o usu�rio
		System.out.println("Digite \n N: para novo cadastro: \n E: para exibir um cliente cadastrado");
		opcao_escolhida = leitura.next().toUpperCase().toCharArray()[0];

		while (opcao_escolhida == 'N' || opcao_escolhida == 'E') {
			// Switch case para chamados os m�todos dependendo da op��o escolhida pelo
			// usu�rio.
			switch (opcao_escolhida) {
			case 'N':
				// chamar cadastro de novo cliente;
				cliente1 = new Cliente();
				cliente1.cadastrar(leitura);
				
				
				opcao_escolhida = ' ';
				break;

			case 'E':
				System.out.println("Qual o c�digo do cliente que deseja exibir:");
				// Campo para o usu�rio digitar o c�digo que deseja procurar e chamar m�todo
				// para buscar e exibir cliente;

			default:
				System.out.println("Digite uma op��o v�lida.");
			}
		}

		/*
		 * System.out.println("Digite seu nome: "); nome = leitura.nextLine();
		 * 
		 * System.out.println("Digite seu endere�o: "); endereco = leitura.nextLine();
		 * 
		 * System.out.println("Digite o n�mero do endere�o: "); numero_endereco =
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
