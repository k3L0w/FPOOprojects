package testes;

import javax.swing.JOptionPane;

import classes.Area;
import classes.Quadrado;
import classes.Retangulo;
import classes.Trapezio;

public class TesteArea {

	public static void main(String[] args) {
		Object[] menu = {"Quadrado", "Retangulo", "Trapezio", "Sair"};
		String opcao;
		Area area = null;
		
		do {
			opcao = (String) JOptionPane.showInputDialog(null, "Escolha um opção", "Polimorfismo", JOptionPane.INFORMATION_MESSAGE, null, menu, "Quadrado");
			switch (opcao) {
			case "Quadrado": area = new Quadrado(5); break;
			case "Retangulo": area = new Retangulo (4,5); break;
			case "Trapezio": area = new Trapezio (2,3,4); break;
			default: break;
			}
			JOptionPane.showMessageDialog(null, "Area = " + area.calcularArea() );
			
		} while (!opcao.equals("Sair"));
		
		
		}
	}
		
