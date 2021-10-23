package classes;

public class Prestacao {
public float valor, taxa, novoValor;
public int meses;
public Prestacao(float valor, float taxa, int meses) {
	
	this.valor = valor;
	this.taxa = taxa;
	this.meses = meses;
}
//metodos (nome do que ele faz...)
public float calculaNovoValor() {  //void seria para devolver nada..
	return this.novoValor = this.valor + (this.valor * this.taxa/100) * this.meses; //calcula novo valor da prestação.
}

}
