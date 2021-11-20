package arquivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.JOptionPane;

import classe.Veiculo;



public class LerEscreverArquivo {


	public void escreverArquivo(List<Veiculo> veiculo) {
			
			FileOutputStream saida ;
			try {
				saida = new FileOutputStream("Veiculo.bin");
				ObjectOutputStream objeto = new ObjectOutputStream(saida);
				objeto.writeObject(veiculo);
				objeto.close();
				JOptionPane.showMessageDialog(null, "Arquivo Gravado com sucesso");
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null,"Arquivo não encontrado", "Arquivo",JOptionPane.ERROR_MESSAGE);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
		public List<Veiculo> lerArquivo() {
			List<Veiculo> veiculo = null;
			FileInputStream entrada;
			try {
				entrada = new FileInputStream("Veiculo.bin");
				
				ObjectInputStream objeto = new ObjectInputStream(entrada);
				veiculo = (List<Veiculo>) objeto.readObject();
				
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null,"Arquivo não encontrado", "Arquivo",JOptionPane.ERROR_MESSAGE);
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				JOptionPane.showMessageDialog(null,"Classe não encontrada", "Arquivo" , JOptionPane.ERROR_MESSAGE);
				
			}
			return veiculo ;
			
			
		}
		
}