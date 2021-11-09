package classes;

import java.io.Serializable;

public class Crianca implements Serializable{
private String nome; 
private int idade;
//construtor
public Crianca(String nome, int idade) {
	super();
	this.nome = nome;
	this.idade = idade;
}
//getters
public String getNome() {
	return nome;
}

public int getIdade() {
	return idade;
}




}
