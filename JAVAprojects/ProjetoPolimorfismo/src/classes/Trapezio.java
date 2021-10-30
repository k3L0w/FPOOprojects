package classes;

public class Trapezio extends Area {
private double altura;
private double baseMaior;
private double baseMenor;
public Trapezio(double altura, double baseMaior, double baseMenor) {
	super();
	this.altura = altura;
	this.baseMaior = baseMaior;
	this.baseMenor = baseMenor;
}
@Override
public double calcularArea() {
	// TODO Auto-generated method stub
	return ((this.baseMaior + this.baseMenor) * this.altura)/2;
}


}

