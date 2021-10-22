package classes;

public class ClienteTreino {
	// atributos
	private String nomeCliente, nomeMae, endereco, cep, cpf, rg, datanascimento, telefone;

	// construtor
	public ClienteTreino(String nomeCliente, String nomeMae, String endereco, String cep, String cpf, String rg,
			String datanascimento, String telefone) {
		super();
		this.nomeCliente = nomeCliente;
		this.nomeMae = nomeMae;
		this.endereco = endereco;
		this.cep = cep;
		this.cpf = cpf;
		this.rg = rg;
		this.datanascimento = datanascimento;
		this.telefone = telefone;
	}

	// Getters and Setters
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

}
