package classes;

public class Conta {
	private int numero;
	private String cliente;
	private double saldo;
	private double limite;
	public static int totalContas;
	
	
	
	//construtor
	public Conta(int numero, String cliente, double saldo, double limite) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
		totalContas++;//incremento mais 1;
		
	}
//métodos
// saca dinheiro da conta
public boolean  sacaGrana(int quantidade) {// passagem de valor 
if ((this.saldo +this.limite)< quantidade) {
	return false;
	} else {
this.saldo = this.saldo - quantidade;
		return true;
		
	}
}
//deposita dinheiro na conta 
public void  depositaGrana(int quantidade) {
		this.saldo += quantidade;
}

//transfere dinheiro de uma conta para outra
public boolean transfereGrana(Conta destino,int quantidade) {
	if (this.sacaGrana(quantidade)) {
		destino.depositaGrana(quantidade);
		return true;
		
	} else {
		return false;
	}
}

//mostrar saldo
public String mostrarSaldo() {
	return "Número da Conta: " + this.numero + "\nNome: "+ this.cliente
			+"\nSaldo: "+ this.saldo;
}
//getters and setters (/source/Generate/Getters e Setters)
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
public double getSaldo() {
	return saldo;
}




}
