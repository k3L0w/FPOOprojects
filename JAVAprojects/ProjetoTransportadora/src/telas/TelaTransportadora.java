package telas;

import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class TelaTransportadora extends JFrame {

	public TelaTransportadora(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		//TELA PADR�O:
		setSize(600, 600);
		getContentPane().setBackground(Color.orange);
		iniciarComponentes(); //bot�o direito do mouse...
		criarEventos(); //bot�o direito do mouse...
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void iniciarComponentes() {
		// TODO Auto-generated method stub
		
	}

	private void criarEventos() {
		// TODO Auto-generated method stub
		
	}
	
	

}
