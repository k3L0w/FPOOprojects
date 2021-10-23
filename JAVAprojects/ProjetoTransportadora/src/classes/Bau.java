package classes;

public class Bau extends Caminhao{
	private String tipoBau;

	public Bau(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
			String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCampinhao,
			String tipoBau) {
		super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo,
				tipoCampinhao);
		this.tipoBau = tipoBau;
	}
	
	@Override
	public String mostrarDados() {
		// TODO Auto-generated method stub
	return "Tipo de Ve�culo: " + this.tipoVeiculo + 
				"\nN de Lugares: " + this.tipoBau + 
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
