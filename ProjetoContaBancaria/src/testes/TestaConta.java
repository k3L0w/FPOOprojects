package testes;

import javax.swing.JOptionPane;

import classes.Conta;

public class TestaConta {

	public static void main(String[] args) {
		// String nome;
		int numero;
		double saldo,limite;
				
		
		//Conta[] contas;
		Conta[] contas = new Conta [2];
		for (int i = 0; i < contas.length; i++) {
			
			String nome = JOptionPane.showInputDialog("Entre com o nome do titular da conta");
			numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com"
					+ " o número da conta"));
			saldo = Double.parseDouble(JOptionPane.showInputDialog("Entre com"
					+ " o saldo inicial da conta"));
			limite = Double.parseDouble(JOptionPane.showInputDialog("Entre com"
					+ " o limite da conta"));
			//objeto
		contas[i] = new Conta(numero, nome, saldo, limite);
			
		}
		
	
	if (contas[0].sacaGrana(400)) {
		JOptionPane.showMessageDialog(null, "Transação feita com sucesso");
	} else {
		JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
	}
			
	contas[0].depositaGrana(20);
	if (contas[1].transfereGrana(contas[0], 200)) {
		JOptionPane.showMessageDialog(null, "Transação feita com sucesso!");
	} else {
		JOptionPane.showMessageDialog(null, "Saldo insuficiente!");

	}
	for (int i = 0; i < contas.length; i++) {
		System.out.println(contas[i].mostrarSaldo());
		
	}
	

	}

}
