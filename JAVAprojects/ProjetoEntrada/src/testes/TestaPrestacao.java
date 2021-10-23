package testes;

import java.util.Scanner; //importação da classe Scanner

import classes.Prestacao;

public class TestaPrestacao {

	public static void main(String[] args) {
		float valor, taxa;
		int meses;
		//criando objeto da classe scanner
		Scanner entrada = new Scanner(System.in); //esse é um objeto.
		System.out.print("Entre com o valor da prestação: ");  //sysout + ctrl + barra de espaço
		valor = entrada.nextFloat(); //entrada pelo teclado
		System.out.print("Entre com o valor da taxa: ");
		taxa = entrada.nextFloat(); //entrada pelo teclado
		System.out.print("Entre com os meses em atraso: ");
		meses = entrada.nextInt(); //entrada pelo teclado
		Prestacao prestacao = new Prestacao(valor, taxa, meses); //variavel prestação
		//Mostrando o novo valor da prestação
		System.out.print("Novo valor da prestação: " + prestacao.calculaNovoValor());
		
	}

}
