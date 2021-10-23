package testa;

import java.util.Scanner;//importação da classe Scanner

import classes.Cliente;

public class ScannerCliente {

	public static void main(String[] args) {
		String nomecliente, nomepet, tipodopet, endereco;
		
		//criando objeto da classe scanner
		Scanner entrada = new Scanner(System.in); //esse é um objeto.
		System.out.print("Entre com o nome do cliente: ");
		nomecliente = entrada.nextLine(); //entrada pelo teclado.
		System.out.print("Entre com o nome do pet: ");
		nomepet = entrada.nextLine(); //entrada pelo teclado.
		System.out.print("Entre com o tipo do Pet: ");
		tipodopet = entrada.nextLine(); //entrada pelo teclado.
		System.out.println("Entre com o endereço do cliente/pet: ");
		endereco = entrada.nextLine(); //entrada pelo teclado.
		
				//criar objeto da classe cliente
		Cliente cliente = new Cliente(nomecliente, nomepet, tipodopet, endereco); //new permite criar um objeto.
		
		//exibir resultado
		System.out.println(cliente.mostrarDados());

	}

}
