package classes;

public class Doador {
	public String nome, genero;
	public float peso;
	public int idade;
	
	//construtor
	public Doador(String nome, String genero, float peso, int idade) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.peso = peso;
		this.idade = idade;
	}
	
	//metodos
	//verificar se o doador pode doar sangue
	public boolean verificarDoarSangue() {
		if (this.peso >= 50 && this.idade >= 18 && this.idade <= 69) {
			return true;
		}
		return false;
	}
	
	
	//mostrar Quantidade de Sangue
	public String mostrarQuantidadeSangue() {
		if (this.genero.equals("MASCULINO")) {
		return "Doar 700 gramas";
			} else {
			return "Doar 400 gramas";
			}
		}
		//mostra os dados dos doadores
	public String mostrarDadosEntrada() {
		return "nome: " + this.nome +
				"\nIdade: " + this.idade +
				"\nPeso: " + this.peso +
				"\nGenero: " + this.genero;
	}

}