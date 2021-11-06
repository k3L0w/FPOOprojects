package testes;

import javax.swing.JOptionPane;

import classes.Adicao;
import classes.Calculadora;
import classes.Divisao;
import classes.Multiplicacao;
import classes.Subtracao;

public class TestaCalculadora {

	public static void main(String[] args) {
	Object[] menu = {"Adição", "Subração", "Multiplicação", "Divisão", "Sair"};
	String opcao;
	Calculadora calculadora = null;
	
	do {
		opcao = (String) JOptionPane.showInputDialog(null, "Selecione uma opção", "Calculadora", JOptionPane.INFORMATION_MESSAGE, null, menu,"Adição");//objetc
		switch (opcao) {
		case "Adição":calculadora = new Adicao(9, 3);
		System.out.println(calculadora.calcularOperacoes()); break;
				
		case "Subração":calculadora = new Subtracao(9, 3);
		System.out.println(calculadora.calcularOperacoes()); break;
		
		case "Multiplicação":calculadora = new Multiplicacao(9, 3);
		System.out.println(calculadora.calcularOperacoes()); break;
		
		case "Divisão":calculadora = new Divisao(9, 3);
		System.out.println(calculadora.calcularOperacoes()); break;

		default:break;
		}
		
	} while (!opcao.equals("Sair"));

	}

}
