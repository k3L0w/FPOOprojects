package painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classe.Veiculo;

public class PainelPesquisa extends JPanel {
private List<Veiculo> veiculos;
private JLabel jlPlaca;
private JTextField jtfPlaca;
private JButton jbPesquisar;
private JTextArea jtaPesquisar;


//Construtor Source -> Criar Construtor da Super Class
	
	public PainelPesquisa(List<Veiculo> veiculos) {
		super();
		setSize(600, 400);
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);	
		this.veiculos = veiculos;
		iniciarComponentes();
		criarEventos();
	}

private void iniciarComponentes() {
	//Objetos 
	jlPlaca = new JLabel("Placa");
	jtfPlaca = new JTextField();
	jbPesquisar = new JButton("Pesquisar");
	jtaPesquisar = new JTextArea();

	//adicionar
	add(jlPlaca);
	add(jtfPlaca);
	add(jtaPesquisar);
	add(jbPesquisar);
	
	//dimensionar
	jlPlaca.setBounds(50,20,80,20);//coluna, linha, largura e altura
	jtfPlaca.setBounds(50,40,80,20);
	jbPesquisar.setBounds(50,100,120,20);
	jtaPesquisar.setBounds(50,120,500,200);


}

private void criarEventos() {
	jbPesquisar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			boolean achou = false;
			for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equals(jtfPlaca.getText())) {
				jtaPesquisar.append((veiculos.indexOf(veiculo) + 1) + "\n" + veiculo.MostrarDados());
				achou = true;
				break;
			}	
			}	
			if (!achou) JOptionPane.showMessageDialog(null,"Placa inexistente","PESQUISA", JOptionPane.WARNING_MESSAGE); 
		}
	});
		}
		
}

	
	

