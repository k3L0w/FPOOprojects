package classe;

public class Bau extends Caminhao {
private String tipoBau;

public Bau(String cor, String placa, String modelo, String fabricante, String anoModelo, String anoFabricacao,
		String numChassis, String tipoCombustivel, String tipoVeiculo, String tipoCaminhao, String tipoBau) {
	super(cor, placa, modelo, fabricante, anoModelo, anoFabricacao, numChassis, tipoCombustivel, tipoVeiculo,
			tipoCaminhao);
	this.tipoBau = tipoBau;
}

public String MostrarDados() {
		return "tipo de Veiculo" + this.tipoVeiculo + "\nFabricante" + this.fabricante + "\nPlaca" + this.placa + "\nTipo de Bau"+ this.tipoBau 
				+"\nCombustivel"+ this.tipoCombustivel + "\nModelo " + this.modelo + "\nAno do Modelo " + this.anoModelo 
				+ "\n Cor:" + this.cor + "\nNúmero de chassi: " + this.numChassis; 
	
}
}