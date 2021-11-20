package classe;

public class Carro extends Veiculo {
private int quantidadeLugares;

	public Carro(String cor, String placa, String modelo, String fabricante, String anoModelo, String anoFabricacao,
			String numChassis, String tipoCombustivel, String tipoVeiculo, String tipoBau) {
		super(cor, placa, modelo, fabricante, anoModelo, anoFabricacao, numChassis, tipoCombustivel, tipoVeiculo, tipoBau);
		this.quantidadeLugares = quantidadeLugares;
	}
	
public String MostrarDados() {
	return "\nTipo de Veiculo: " + this.tipoVeiculo + "\nFabricante: " + this.fabricante + "\nPlaca: " + this.placa + "\nCombustivel: "
			+ this.tipoCombustivel + "\nModelo:  " + this.modelo + "\nAno do Modelo: " + this.anoModelo + "\n 1Cor: " + this.cor + "\nQuantidade: " + this.quantidadeLugares + "\nNúmero de chassi: " + this.numChassis + "\n*******************************************************************"; 
	
}
}
