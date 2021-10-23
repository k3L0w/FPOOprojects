package classes;

public class Onibus extends Veiculos{
	private int numeroPoltronas;

	public Onibus(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
			String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, int numeroPoltronas) {
		super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);
		this.numeroPoltronas = numeroPoltronas;
	}

	@Override
	public String mostrarDados() {
		// TODO Auto-generated method stub
	return "Tipo de Veículo: " + this.tipoVeiculo + 
				"\nN de Lugares: " + this.numeroPoltronas + 
				"\nPlaca: "+this.placa +
				"\nCombustível: " + this.tipoCombustivel +
				"\nFabricante: " + this.fabricante +
				"\nN de chassi: " + this.numeroChassis + 
				"\ncor: :" + this.cor +
				"\nModelo: " + this.modelo +
				"\nAno de Fabricação: " + this.anoFabricacao + 
				"\nAno do Modelo: " + this.anoModelo;
		}
		
}
