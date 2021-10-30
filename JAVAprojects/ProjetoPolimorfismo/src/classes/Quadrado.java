package classes;

public class Quadrado extends Area{
private double lado;

public Quadrado(double lado) {
	super();
	this.lado = lado;
}

@Override
public double calcularArea() {
	// TODO Auto-generated method stub
	return this.lado * this.lado;
}
	

}

