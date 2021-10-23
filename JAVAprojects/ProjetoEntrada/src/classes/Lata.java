package classes;

public class Lata {
//atributos
public float raio, altura, volume;


//construtor
public Lata(float raio, float altura) {
	super();
	this.raio = raio;
	this.altura = altura;
}

//metodo
	public float calcularVolume() {
		return volume = (float) (Math.PI * Math.pow(this.raio, 2) * this.altura);
	}

}
