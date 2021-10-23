package aluno;

public class ClasseAluno {
//atributos
public float nota1, nota2, media;
public String nome;

//construtor
public ClasseAluno(float nota1, float nota2, String nome) {
	//super(); //desnecessario
	this.nota1 = nota1;
	this.nota2 = nota2;
	this.nome = nome;
}	
//metodo
public float calculaMedia() {
	return this.media = (this.nota1 + this.nota2) / 2; 
}
}