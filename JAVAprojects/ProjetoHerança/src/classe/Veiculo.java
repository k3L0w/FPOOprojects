package classe;

import java.io.Serializable;

public class Veiculo implements Serializable {

	protected String cor, placa, modelo, fabricante; 
    protected String anoModelo, anoFabricacao, numChassis , tipoCombustivel, tipoVeiculo,tipoBau;
	public Veiculo(String cor, String placa, String modelo, String fabricante, String anoModelo, String anoFabricacao,
			String numChassis, String tipoCombustivel, String tipoVeiculo, String tipoBau) {
		super();
		this.cor = cor;
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.numChassis = numChassis;
		this.tipoCombustivel = tipoCombustivel;
		this.tipoVeiculo = tipoVeiculo;
		this.tipoBau = tipoBau;
		}
public String MostrarDados() {
	return null;
	
	}

	//getters e setters (Menu Generate Getters and Setters)
	public String getCor() {
		return cor;
	}
	public String getPlaca() {
		return placa;
	}
	public String getModelo() {
		return modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public String getAnoModelo() {
		return anoModelo;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public String getNumChassis() {
		return numChassis;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public String getTipo() {
		return tipoCombustivel;
	}
	

}
	