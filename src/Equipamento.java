public class Equipamento {
	
	//Declaração de variáveis da classe Equipamento;
	private String fabricante;
	private String modelo_central;
	private String qtd_placa_ramal_analogico;
	private String qtd_placa_ramal_digital;
	private String qtd_tronco_analogico;
	private String qtd_tronco_digital;
	
	
//Construtor vazio;
	public Equipamento() {
		super();
	}

//Construtor com campos (completo);
	public Equipamento(String fabricante, String modelo_central, String qtd_placa_ramal_analogico,
			String qtd_placa_ramal_digital, String qtd_tronco_analogico, String qtd_tronco_digital) {
		super();
		
		this.fabricante = fabricante;
		this.modelo_central = modelo_central;
		this.qtd_placa_ramal_analogico = qtd_placa_ramal_analogico;
		this.qtd_placa_ramal_digital = qtd_placa_ramal_digital;
		this.qtd_tronco_analogico = qtd_tronco_analogico;
		this.qtd_tronco_digital = qtd_tronco_digital;
	}
	
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo_central() {
		return modelo_central;
	}
	public void setModelo_central(String modelo_central) {
		this.modelo_central = modelo_central;
	}
	public String getQtd_placa_ramal_analogico() {
		return qtd_placa_ramal_analogico;
	}
	public void setQtd_placa_ramal_analogico(String qtd_placa_ramal_analogico) {
		this.qtd_placa_ramal_analogico = qtd_placa_ramal_analogico;
	}
	public String getQtd_placa_ramal_digital() {
		return qtd_placa_ramal_digital;
	}
	public void setQtd_placa_ramal_digital(String qtd_placa_ramal_digital) {
		this.qtd_placa_ramal_digital = qtd_placa_ramal_digital;
	}
	public String getQtd_tronco_analogico() {
		return qtd_tronco_analogico;
	}
	public void setQtd_tronco_analogico(String qtd_tronco_analogico) {
		this.qtd_tronco_analogico = qtd_tronco_analogico;
	}
	public String getQtd_tronco_digital() {
		return qtd_tronco_digital;
	}
	public void setQtd_tronco_digital(String qtd_tronco_digital) {
		this.qtd_tronco_digital = qtd_tronco_digital;
	}
	
	
	
	
	
	

}
