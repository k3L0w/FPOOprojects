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
		return "Tipo de Ve�culo: " + this.tipoVeiculo + 
				"\nN de Lugares: " + this.numerosLugares + 
				"\nPlaca: "+this.placa +
				"\nCombust�vel: " + this.tipoCombustivel +
				"\nFabricante: " + this.fabricante +
				"\nN de chassi: " + this.numeroChassis + 
				"\ncor: :" + this.cor +
				"\nModelo: " + this.modelo +
				"\nAno de Fabrica��o: " + this.anoFabricacao + 
				"\nAno do Modelo: " + this.anoModelo + "\n***************";
		}
		
}
