package testes;

import java.util.Scanner; //importa��o da classe Scanner

import classes.Prestacao;

public class TestaPrestacao {

	public static void main(String[] args) {
		float valor, taxa;
		int meses;
		//criando objeto da classe scanner
		Scanner entrada = new Scanner(System.in); //esse � um objeto.
		System.out.print("Entre com o valor da presta��o: ");  //sysout + ctrl + barra de espa�o
		valor = entrada.nextFloat(); //entrada pelo teclado
		System.out.print("Entre com o valor da taxa: ");
		taxa = entrada.nextFloat(); //entrada pelo teclado
		System.out.print("Entre com os meses em atraso: ");
		meses = entrada.nextInt(); //entrada pelo teclado
		Prestacao prestacao = new Prestacao(valor, taxa, meses); //variavel presta��o
		//Mostrando o novo valor da presta��o
		System.out.print("Novo valor da presta��o: " + prestacao.calculaNovoValor());
		
	}

}
