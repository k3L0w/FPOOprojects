package jogo;

import javax.swing.JOptionPane;

public class JogoAdivinha {

	public static void main(String[] args) {
		int resp = 0;
		do {
			//define um numero qualquer entre 0 e 10
			int NumSorteado = (int) Math.ceil(Math.random() * 10);
			//lista de opcoes para o combo box da caixa de dialogo
			Object[] opcoes = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
			String resposta;
			while (true) {
				// loop para evitar qeu o jojo feche depois da primeira resposta
				resposta = (String) JOptionPane.showInputDialog(null, 
						"Em que numero estou pensando?", "Jogo de Adivinha]",
						JOptionPane.QUESTION_MESSAGE, null, opcoes, "2");
							
			}
			
		} while (resp != 1);
		
	}

}
