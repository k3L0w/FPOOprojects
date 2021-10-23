package testes;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

import classes.Lata;

public class TestaLata {

	public static void main(String[] args) {
	float raio, altura;
	//entrando com dados:
	raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o raio: ", "CADASTRO LATA", JOptionPane.INFORMATION_MESSAGE)); 
	altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o altura: ", "CADASTRO LATA", JOptionPane.INFORMATION_MESSAGE)); 
	
	//criando o objeto da classe Lata
	Lata lata = new Lata(raio, altura);
	JOptionPane.showMessageDialog(null, "VOLUME\n"+ lata.calcularVolume(),"CADASTRO LATA", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imagem/lata.png"));
	
	}

}
