package classes;

public class Retangulo extends Area {
private double comprimento;
private double largura;

public Retangulo(double comprimento, double largura) {
	super();
	this.comprimento = comprimento;
	this.largura = largura;
}

@Override
public double calcularArea() {
	// TODO Auto-generated method stub
	return this.comprimento * this.largura;
}

	

}
