package classes;

public class Basculante extends Veiculos{

	public Basculante(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
			String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo) {
		super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mostrarDados() {
		// TODO Auto-generated method stub
	return "Tipo de Veículo: " + this.tipoVeiculo + 
				
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

