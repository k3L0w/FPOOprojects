package testes;

import javax.swing.JOptionPane;

import classes.Paciente;

public class testaPaciente {

	public static void main(String[] args) {
		//declarar variáveis
		String nome, genero;
		float altura;

		//entrar com dados
		nome = JOptionPane.showInputDialog("Informe nome do paciente: ");
		genero = JOptionPane.showInputDialog("Informe genero do paciente: ").toUpperCase();
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe altura do paciente: "));  
		
		//objeto da classe paciente
		Paciente paciente = new Paciente(nome, genero, altura);
		JOptionPane.showMessageDialog(null, paciente.mostrarDados()+ "Peso Ideal: "+ paciente.calculaPesoIdeal());
			
		
	}

}
