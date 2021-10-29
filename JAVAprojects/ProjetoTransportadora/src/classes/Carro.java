package classes;

public class Carro extends Veiculos {
	private int numerosLugares;

	public Carro(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
			String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, int numerosLugares) {
		super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);
		this.numerosLugares = numerosLugares;
	}

	@Override
	public String mostrarDados() {
		return "Tipo de Veículo: " + this.tipoVeiculo + 
				"\nN de Lugares: " + this.numerosLugares + 
				"\nPlaca: "+this.placa +
				"\nCombustível: " + this.tipoCombustivel +
				"\nFabricante: " + this.fabricante +
				"\nN de chassi: " + this.numeroChassis + 
				"\ncor: :" + this.cor +
				"\nModelo: " + this.modelo +
				"\nAno de Fabricação: " + this.anoFabricacao + 
				"\nAno do Modelo: " + this.anoModelo + "\n***************";
		}
		
}
