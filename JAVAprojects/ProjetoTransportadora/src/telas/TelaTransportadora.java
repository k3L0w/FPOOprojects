package telas;

import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class TelaTransportadora extends JFrame {

	public TelaTransportadora(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		//TELA PADRÃO:
		setSize(600, 600);
		getContentPane().setBackground(Color.orange);
		iniciarComponentes(); //botão direito do mouse...
		criarEventos(); //botão direito do mouse...
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void iniciarComponentes() {
		// TODO Auto-generated method stub
		
	}

	private void criarEventos() {
		// TODO Auto-generated method stub
		
	}
	
	

}
