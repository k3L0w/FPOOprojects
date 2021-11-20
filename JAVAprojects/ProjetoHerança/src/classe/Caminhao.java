package classe;

public class Caminhao extends Veiculo{
protected String tipoCaminhao;

public Caminhao(String cor, String placa, String modelo, String fabricante, String anoModelo, String anoFabricacao,
		String numChassis, String tipoCombustivel, String tipoVeiculo, String tipoCaminhao) {
	super(cor, placa, modelo, fabricante, anoModelo, anoFabricacao, numChassis, tipoCombustivel, tipoVeiculo, tipoCaminhao);
	this.tipoCaminhao = tipoCaminhao;
}

}

