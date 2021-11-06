package classes;

public class Subtracao extends Calculadora {

	public Subtracao(float valor1, float valor2) {
		super(valor1, valor2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularOperacoes() {
		// TODO Auto-generated method stub
		return this.valor1 - this.valor2;
	}

}
