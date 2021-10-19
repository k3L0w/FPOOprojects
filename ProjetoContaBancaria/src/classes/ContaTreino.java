package classes;

public class ContaTreino {
	// atributos
	private int numero;
	private String cliente;
	private double saldo;
	private double limite;
	public static int totalcontas;

	// construtor
	public ContaTreino(int numero, String cliente, double saldo, double limite) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
		totalcontas++; //incremento mais 1
	}

	// metodo: saca dinheiro da conta
	public boolean sacaDinheiro(int quantidade) { // passagem de valor
		if ((this.saldo + this.limite) < quantidade) {
			return false;
		} else {
			this.saldo = this.saldo - quantidade;
			return true;

		}

	}

	// metodo: deposita dinheiro na conta
	public void depositaGrana(int quantidade) {
		this.saldo += quantidade;
	}

	// metodo: transfere dinheiro de uma conta para outra
	public boolean transfereDinheiro(Conta destino, int quantidade) {
		if (this.sacaDinheiro(quantidade)) {
			destino.depositaGrana(quantidade);
			return true;
		} else {
			return false;
		}		
		
	}

	// metodo: mostrar saldo
	public String mostraSaldo() {
		return "Número da conta: " + this.numero + "\nNome: " + this.cliente + "\nSaldo" + this.saldo;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public String getCliente() {
		return cliente;
	}

	public static int getTotalcontas() {
		return totalcontas;
	}

}
