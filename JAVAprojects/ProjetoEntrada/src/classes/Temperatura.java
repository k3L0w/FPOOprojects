package classes;

public class Temperatura {

	//atributos1
	public float celsius, fahrenheit;
		
	//construtor
	public Temperatura(float celsius) {
		super();
		this.celsius = celsius;
	}
		
	//métodos
	public float conversaoTemperatura() {
		this.fahrenheit = (9 * this.celsius +160)/5;
		return fahrenheit;
	}

}