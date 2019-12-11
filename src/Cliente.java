import java.util.Scanner;

public class Cliente {
		
	//Declaração das variáveis da classe Cliente.
		private String nome;
		private String endereco;
		private String numero_endereco;
		private String bairro;
		private String cidade;
		private String estado;
		private String uf;
		private String cep;
		private String cnpj;
		private String cpf;
		
		//Construtor vazio;
		public Cliente() {
			super();
		}

		//Construtor com campos, completo;
		public Cliente(String nome, String endereco, String numero_endereco, String bairro, String cidade,
				String estado, String uf, String cep, String cnpj, String cpf) {
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.numero_endereco = numero_endereco;
			this.bairro = bairro;
			this.cidade = cidade;
			this.estado = estado;
			this.uf = uf;
			this.cep = cep;
			this.cnpj = cnpj;
			this.cpf = cpf;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEndereco() {
			return endereco;
		}


		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}


		public String getNumero_endereco() {
			return numero_endereco;
		}


		public void setNumero_endereco(String numero_endereco) {
			this.numero_endereco = numero_endereco;
		}


		public String getBairro() {
			return bairro;
		}


		public void setBairro(String bairro) {
			this.bairro = bairro;
		}


		public String getCidade() {
			return cidade;
		}


		public void setCidade(String cidade) {
			this.cidade = cidade;
		}


		public String getEstado() {
			return estado;
		}


		public void setEstado(String estado) {
			this.estado = estado;
		}


		public String getUf() {
			return uf;
		}


		public void setUf(String uf) {
			this.uf = uf;
		}


		public String getCep() {
			return cep;
		}


		public void setCep(String cep) {
			this.cep = cep;
		}


		public String getCnpj() {
			return cnpj;
		}


		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}


		public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		
		public void cadastrar(Scanner leitura) {
			
			System.out.println("Digite seu nome: ");
			this.nome = leitura.next();

			System.out.println("Digite seu endereço: ");
			this.endereco = leitura.next();

			System.out.println("Digite o número do endereço: ");
			this.numero_endereco = leitura.next();

			System.out.println("Digite o bairro: ");
			this.bairro = leitura.next();

			System.out.println("Digite a cidade: ");
			this.cidade = leitura.next();

			System.out.println("Digite o estado: ");
			this.estado = leitura.next();

			System.out.println("Digite a UF: ");
			this.uf = leitura.next();

			System.out.println("Digite o CEP: ");
			this.cep = leitura.next();

			System.out.println("Digite o cnpj: ");
			this.cnpj = leitura.next();

			System.out.println("Digite o cpf: ");
			this.cpf = leitura.next();
			
		}

	}

