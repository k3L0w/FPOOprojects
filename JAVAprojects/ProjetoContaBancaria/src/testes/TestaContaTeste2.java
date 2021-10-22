package testes;

import classes.Conta;

public class TestaContaTeste2 {

	public static void main(String[] args) {
		Conta c1 = new Conta(0,"Patolino",0,0);
		c1.depositaGrana(200);
		Conta c2 = new Conta(1, "Malba", 0, 0);
		c2 = new Conta (0, "Patolino",0, 0);
		c2.depositaGrana(200);
		if (c1 == c2) {
			System.out.println("Iguais");
			
		} else {
			System.out.println("que doidera");
			System.out.println(c1 +"\n"+c2);
		}
				
	}

}




