package testes;

import javax.swing.JOptionPane;

import classes.Conta;

public class TestaContaTeste3 {

	public static void main(String[] args) {
		Conta conta1 = new Conta(1, "Jose", 100, 100);
		Conta conta2 = new Conta(2, "Josue", 100, 100);
		Conta conta3 = new Conta(3, "Magrela", 100, 100);
		
		System.out.println("Numero de contas: "+ Conta.totalContas);
	

	}

}
