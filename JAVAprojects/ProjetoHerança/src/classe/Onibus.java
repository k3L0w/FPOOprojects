package classe;

public class Onibus extends Veiculo {
private int quantidadedePoltronas;
	public Onibus(String cor, String placa, String modelo, String fabricante, String anoModelo, String anoFabricacao,
			String numChassis, String tipoCombustivel, String tipoVeiculo, String tipoBau) {
		super(cor, placa, modelo, fabricante, anoModelo, anoFabricacao, numChassis, tipoCombustivel, tipoVeiculo, tipoBau);
        this.quantidadedePoltronas = quantidadedePoltronas;
}

public String MostrarDados() {
return "tipo de Veiculo: " + this.tipoVeiculo + "\nFabricante: " + this.fabricante + "\nPlaca: " + this.placa + "\nCombustivel: "
	+ this.tipoCombustivel + "\nModelo: " + this.modelo + "\nAno do Modelo: " + this.anoModelo + "\n Cor: " + this.cor + "\nQuantidade: " + this.quantidadedePoltronas + "\nNúmero de chassi: " + this.numChassis; 

}
}
