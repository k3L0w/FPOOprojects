package testes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import classes.Temperatura; //classe importada

public class TestaTemperaturaJOptionPane {

	public static void main(String[] args) {
		float celsius; 
		//entrando com dados:
		celsius = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o valor da temperatura em Celsius: ", "CONVERSÃO DE TEMPERATURA", JOptionPane.INFORMATION_MESSAGE));
		
	//criando o objeto da classe Temperatura
	Temperatura temperatura = new Temperatura(celsius); //objeto da classe temperatura, já posso manipulá-lo.
	//mostrar a conversão de Celsius para Fahrenheit
	JOptionPane.showMessageDialog(null, "Fahrenheit: "+ temperatura.conversaoTemperatura(), "CONVERSÃO DE TEMPERATURA", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imagem/icone_temperatura.png"));
	
	}

}
