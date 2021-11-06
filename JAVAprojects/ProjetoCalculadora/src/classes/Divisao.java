package classes;

public class Divisao extends Calculadora {

	public Divisao(float valor1, float valor2) {
		super(valor1, valor2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularOperacoes() {
		// TODO Auto-generated method stub
		return this.valor1 / this.valor2;
	}

}
