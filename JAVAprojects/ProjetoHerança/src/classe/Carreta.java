package classe;

public class Carreta extends Caminhao {
private int quantContainers;
	public Carreta(String cor, String placa, String modelo, String fabricante, String anoModelo, String anoFabricacao,
			String numChassis, String tipoCombustivel, String tipoVeiculo, String tipoCaminhao) {
		super(cor, placa, modelo, fabricante, anoModelo, anoFabricacao, numChassis, tipoCombustivel, tipoVeiculo, tipoCaminhao);
		this.quantContainers = quantContainers;
	}

	public String MostrarDados() {
		return "tipo de Veiculo" + this.tipoVeiculo + "\nFabricante" + this.fabricante + "\nPlaca" + this.placa + "\nCombustivel"
				+ this.tipoCombustivel + "\nModelo: " + this.modelo + "\nAno do Modelo: " + this.anoModelo + "\n Cor:" + this.cor + "\nQuantidade de Containers : " + this.quantContainers + "\nNúmero de chassi: " + this.numChassis; 
		
	}
	}
