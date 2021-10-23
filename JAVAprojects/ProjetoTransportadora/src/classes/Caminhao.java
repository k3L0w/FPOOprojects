package classes;

public class Caminhao extends Veiculos{
	protected String TipoCampinhao;

	public Caminhao(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
			String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCampinhao) {
		super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);
		TipoCampinhao = tipoCampinhao;
	}

	@Override
	public String mostrarDados() {
		// TODO Auto-generated method stub
	return "Tipo de Ve�culo: " + this.tipoVeiculo + 
				 
				"\nPlaca: "+this.placa +
				"\nCombust�vel: " + this.tipoCombustivel +
				"\nFabricante: " + this.fabricante +
				"\nN de chassi: " + this.numeroChassis + 
				"\ncor: :" + this.cor +
				"\nModelo: " + this.modelo +
				"\nAno de Fabrica��o: " + this.anoFabricacao + 
				"\nAno do Modelo: " + this.anoModelo;
		}
		
}

