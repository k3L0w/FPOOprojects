package classes;

public class Conta extends Cliente {
	private int numero;
	private double saldo;
	private double limite;
	public static int totalContas;
	
	//construtor
		public Conta(java.lang.String nome, java.lang.String cpf, java.lang.String endereco, java.lang.String telefone,
			int numero, double saldo, double limite) {
		super(nome, cpf, endereco, telefone);
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
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
	return "Número da Conta: " + this.numero + "\nNome: "+ this.getNome()
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
public double getSaldo() {
	return saldo;
}




}
