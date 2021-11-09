package testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Crianca;
import classes.LerEscreverObjetos;

public class TestaCrianca {

	public static void main(String[] args) {
		Crianca crianca = new Crianca("Julia", 7);
		Object[] menu = {"Cadastrar", "Gravar", "Ler Arquivo", "Sair"}; //menu
		String opcao;
		List<Crianca> criancas = new ArrayList<>(); //matriz dinamica, guardar quantas quiser.
		LerEscreverObjetos lerEscreverObjetos = new LerEscreverObjetos();//ler escrever objetos...
		
		
		do {
		opcao = (String) JOptionPane.showInputDialog(null, "Escolha a opção", "Arquivo", JOptionPane.INFORMATION_MESSAGE, null, menu, "Cadastrar"); //realizar o cast	
		
		switch (opcao) {
		case "Cadastrar": 
			criancas.add(new Crianca(JOptionPane.showInputDialog("Entre com o nome da criança"), Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade da criança"))));
			break;
			
		case "Gravar": 
			if (!criancas.isEmpty()) {
				lerEscreverObjetos.escreverObjeto(criancas);
				
			} else {
				JOptionPane.showMessageDialog(null, "Lista gravada!");
			}
			break;
			
			case "Ler Arquivo": 
			if (!criancas.isEmpty()) {
					criancas = lerEscreverObjetos.lerObjeto();
					for (Crianca crianca1 : criancas) {
						System.out.println("Nome: "+crianca1.getNome()
						+ "\nIdade: "+ crianca1.getIdade());
					}
								
				} else {
					JOptionPane.showMessageDialog(null, "Lista vazia!");
			}
			break;
	
		
		case "Sair": break;

		default:break;
		}
						
			
		} while (!opcao.equals("Sair"));
		
		LerEscreverObjetos escreverObjetos = new LerEscreverObjetos();
		
		
		
		//escreverObjetos.escreverObjeto(crianca);
		//escreverObjetos.lerObjeto();
		
		

	}

}
