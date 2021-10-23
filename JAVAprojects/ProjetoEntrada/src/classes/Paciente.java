package classes;

public class Paciente {
	public String nome, genero;
	public float altura,pesoIdeal;
	public Paciente(String nome, String genero, float altura) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.altura = altura;
	}
	
	//metodos
	//calcula o peso ideal
	public float calculaPesoIdeal() {
		if (this.genero.equals("FEMININO" )) {
		this.pesoIdeal = (float) ((62.1*this.altura) - 44.7);
			} else {
			this.pesoIdeal = (float) ((72.7*this.altura) - 58);
				
			}
		return this.pesoIdeal;
	}
	//mostra os dados do paciente
	public String mostrarDados() {
		return "Dados: \nNome: "+ this.nome + "\nGênero: " + this.genero + "\naltura: " + this.altura;
		
	}

}
