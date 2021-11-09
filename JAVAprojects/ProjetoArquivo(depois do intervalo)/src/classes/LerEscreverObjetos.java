package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.JOptionPane;

public class LerEscreverObjetos {

	public void escreverObjeto(List<Crianca> criancas) {//passar um objeto de crianca
		FileOutputStream fluxo;//trabalha com a escrita de um arquivo, ou seja cria um arquivo //adicionar o try / catch
		
		try {
			fluxo = new FileOutputStream("Criança.bin"); //criando o arquivo, criança.bin
			ObjectOutputStream objeto = new ObjectOutputStream(fluxo);//adicionar uma clause catch (IOEception), não se sabe o que acontece
			
				objeto.writeObject(criancas); //gravando uma lista de criança.
						
			objeto.close();//fecha o arquivo
			JOptionPane.showMessageDialog(null, "Arquivo Gravado");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //traço da pilha.
			
		}
		
	}
	public List<Crianca> lerObjeto() {
		List<Crianca> criancas = null; //variável para receber
		FileInputStream fluxo;
		
		try {
			fluxo = new FileInputStream("Criança.bin");
			ObjectInputStream objeto = new ObjectInputStream(fluxo);
			criancas = (List<Crianca>) objeto.readObject();//recuperar o objeto lista de crianças
			objeto.close();
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			/*se a classe do objeto lido não
			 * puder se localizada, readObject()
			 */
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
		}
		return criancas;
		
		
	}
	
}
