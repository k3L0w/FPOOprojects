package testes;

import javax.swing.JOptionPane;

import classes.Conta;
import classes.ContaTreino;

public class TestaContaTreino {

	public static void main(String[] args) {
		int numero;
		double saldo, limite;
		
		//Conta[] contas;
		Conta[] contas = new Conta [2];
		for (int i = 0; i < contas.length; i++) {
			String nome = JOptionPane.showInputDialog("Informe o nome do titular da conta");
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o nome do titular da conta"));
			saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo inicial da conta"));
			limite = Double.parseDouble(JOptionPane.showInputDialog("limite da conta"));
			
		//Ojbeto
		contas[i] = new Conta(numero, nome, saldo, limite);
		}
		
		if (contas[0].sacaDinheiro()400) {
			JOptionPane.showMessageDialog(null, "Transação efetuada");
			
		} else {
			JOptionPane.showMessageDialog(null, "Saldo indisponível");

		}
		contas[0].depositaGrana (20)) {
		if (contas[1].transfereGrana(contas[0], 200)) {
			JOptionPane.showMessageDialog(null, "Transação efetuada");
		} else {
			JOptionPane.showMessageDialog(null, "Saldo indisponível");
		}
		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i].mostraSaldo());
		}
			
		}
		
	}

}
