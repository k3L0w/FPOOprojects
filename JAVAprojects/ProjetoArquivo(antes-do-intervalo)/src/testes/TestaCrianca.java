package testes;

import classes.Crianca;
import classes.LerEscreverObjetos;

public class TestaCrianca {

	public static void main(String[] args) {
		Crianca crianca = new Crianca("Julia", 7);
		LerEscreverObjetos escreverObjetos = new LerEscreverObjetos();
		
		//escreverObjetos.escreverObjeto(crianca);
		escreverObjetos.lerObjeto();
		
		
		

	}

}
