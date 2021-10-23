package testealuno;

import java.util.Scanner;

import aluno.ClasseAluno;

public class TesteAluno {

	public static void main(String[] args) {
		String nome;
		float nota1, nota2;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Nome do aluno: ");
		nome = entrada.next();
		
		System.out.print("Nota1 do aluno: ");
		nota1 = entrada.nextFloat();
		
		System.out.print("Nota2: ");
		nota2 = entrada.nextFloat();
		

		
		ClasseAluno aluno = new ClasseAluno(nota1, nota2, nome);
		System.out.print("Nome: " + aluno.nome + "\tMedia: " + aluno.calculaMedia());
				
	}

}
