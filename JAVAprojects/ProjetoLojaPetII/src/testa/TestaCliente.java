package testa;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import classes.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		String nomecliente, nomepet, tipopet, endereco;
		
		//entrando com os dados
		nomecliente = JOptionPane.showInputDialog(null, "Informe o nome do(a) cliente: ", "CADASTRO DE CLIENTE(s)/PET(s)", JOptionPane.INFORMATION_MESSAGE);
		nomepet = JOptionPane.showInputDialog(null, "Informe o nome do Pet: ", "CADASTRO DE CLIENTE(s)/PET(s)", JOptionPane.INFORMATION_MESSAGE);
		tipopet = JOptionPane.showInputDialog(null, "Informe o tipo do Pet: ", "CADASTRO DE CLIENTE(s)/PET(s)", JOptionPane.INFORMATION_MESSAGE);
		endereco = JOptionPane.showInputDialog(null, "Informe o endereço", "CADASTRO DE CLIENTE(s)/PET(s)", JOptionPane.INFORMATION_MESSAGE);
		
		//criando o objeto
		Cliente cliente = new Cliente(nomecliente, nomepet, tipopet, endereco);
			JOptionPane.showMessageDialog(null, "DADOS DE CADASTRO PET\n" +cliente.mostrarDados(), "\nCADASTRO DE CLIENTES E PETs\n", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imagem/pet.png"));

	}

}
