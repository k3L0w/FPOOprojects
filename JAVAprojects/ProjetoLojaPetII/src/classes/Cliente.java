package classes;

public class Cliente {

//atributos
public String nomecliente, nomepet, tipopet, endereco;

//construtor
public Cliente(String cliente, String pet, String tipopet, String endereco) {
	//super();//desnecessário
	this.nomecliente = cliente;
	this.nomepet = pet;
	this.tipopet = tipopet;
	this.endereco = endereco;
	
}
//metodo
public String mostrarDados() {
	// + concatena o resultado
	return "Cliente: " + this.nomecliente + "\nNome do Pet: " + this.nomepet + "\nTipo do pet: " + this.tipopet + "\nEndereço " + this.endereco;
} 

}
