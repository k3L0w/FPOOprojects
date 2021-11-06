package testes;

import javax.swing.JOptionPane;

import classes.Adicao;
import classes.Calculadora;
import classes.Divisao;
import classes.Multiplicacao;
import classes.Subtracao;

public class TestaCalculadora {

	public static void main(String[] args) {
	Object[] menu = {"Adi��o", "Subra��o", "Multiplica��o", "Divis�o", "Sair"};
	String opcao;
	Calculadora calculadora = null;
	
	do {
		opcao = (String) JOptionPane.showInputDialog(null, "Selecione uma op��o", "Calculadora", JOptionPane.INFORMATION_MESSAGE, null, menu,"Adi��o");//objetc
		switch (opcao) {
		case "Adi��o":calculadora = new Adicao(9, 3);
		System.out.println(calculadora.calcularOperacoes()); break;
				
		case "Subra��o":calculadora = new Subtracao(9, 3);
		System.out.println(calculadora.calcularOperacoes()); break;
		
		case "Multiplica��o":calculadora = new Multiplicacao(9, 3);
		System.out.println(calculadora.calcularOperacoes()); break;
		
		case "Divis�o":calculadora = new Divisao(9, 3);
		System.out.println(calculadora.calcularOperacoes()); break;

		default:break;
		}
		
	} while (!opcao.equals("Sair"));

	}

}
