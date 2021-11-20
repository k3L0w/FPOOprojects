package painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import classe.Veiculo;

public class PainelDeletarCadastro extends JPanel {
private List<Veiculo> veiculo;
private JLabel jlIndice;
private JTextField jtfIndice;
private JButton jbDeletar;

	public PainelDeletarCadastro(List<Veiculo> veiculo) {
		super();
		setSize(600, 400);
		setLayout(null);
		setBackground(Color.red);
		this.veiculo = veiculo;
		iniciarComponentes();
		criarEventos();
	}

	private void iniciarComponentes() {
		//objetos
		jlIndice = new JLabel("Indice");
		jtfIndice = new JTextField();
		jbDeletar = new JButton("Deletar");
				
		//adicionar
	   add(jlIndice);
	   add(jtfIndice);
	   add(jbDeletar);
	   
	   
	  //dimensionar
	   jlIndice.setBounds(40,40,100,20);
	   jtfIndice.setBounds(40,60,100,20);
	   jbDeletar.setBounds(40,100,100,20);
	   
	}

	private void criarEventos() {
		jbDeletar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int indice = Integer.parseInt(jtfIndice.getText()) -1;
					int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir o veiculo?","Exclusão de cadastro", JOptionPane.YES_NO_OPTION);
					if (resposta == 0 ) {
						veiculo.remove(indice);
						JOptionPane.showMessageDialog(null,"Veículo excluído com sucesso");
						
					}
				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(null, "Campo vazio ou insira números!");
					
				} catch (IndexOutOfBoundsException e2) {
					JOptionPane.showMessageDialog(null, "Indice inexiste!");
				}
				
			}
		});
	}

	
}
