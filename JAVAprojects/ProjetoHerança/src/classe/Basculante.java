package classe;

public class Basculante extends Caminhao {

	public Basculante(String cor, String placa, String modelo, String fabricante, String anoModelo,
			String anoFabricacao, String numChassis, String tipoCombustivel, String tipoVeiculo, String tipoCaminhao) {
		super(cor, placa, modelo, fabricante, anoModelo, anoFabricacao, numChassis, tipoCombustivel, tipoVeiculo, tipoCaminhao);
		// TODO Auto-generated constructor stub
	}

public String MostrarDados() {
		return "tipo de Veiculo" + this.tipoVeiculo + "\nFabricante" + this.fabricante + "\nPlaca" + this.placa  
				+"\nCombustivel"+ this.tipoCombustivel + "\nModelo " + this.modelo + "\nAno do Modelo " + this.anoModelo 
				+ "\n Cor:" + this.cor + "\nNúmero de chassi: " + this.numChassis + "\nTipo de Caminhão" + this.tipoCaminhao; 
	
}
}