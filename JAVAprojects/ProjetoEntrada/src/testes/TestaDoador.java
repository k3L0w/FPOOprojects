package testes;

import javax.swing.JOptionPane;

import classes.Doador;

public class TestaDoador {

	public static void main(String[] args) {
		//declarar variáveis
		String nome, genero;
		float peso;
		int idade;
		
		//entrar com dados
		nome = JOptionPane.showInputDialog("Informe nome do doador: ");
		genero = JOptionPane.showInputDialog("Informe gênero do doador: ");
		peso = Float.parseFloat(JOptionPane.showInputDialog("Entre com o peso do doador"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade do Doador: "));
				
		//objeto
		Doador doador = new Doador(nome, genero, peso, idade);
		
		//mostrar dados
		JOptionPane.showMessageDialog(null, doador.mostrarDadosEntrada() + "\n" + doador.mostrarQuantidadeSangue());
			
	}

}


