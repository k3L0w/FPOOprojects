package paineis;

import java.awt.Color;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import classes.Carro;
import classes.Veiculos;

public class PainelMostrar extends JPanel { //em Source / Generate construtor...
private JButton jbCarro, jbOnibus, jbCaminhao;
private JRadioButton jrbBau, jrbCarreta, jrbBasculante;
private JTextArea jtaMostrar; 
private JScrollPane jsMostrar;

private List<Veiculos> veiculos;


	public PainelMostrar(List<Veiculos> veiculos2, List<Veiculos> veiculos) {
		super();
		// super();
		setSize(400, 400);
		setLayout(null);
		setBackground(Color.cyan);
		this.veiculos = veiculos;
		iniciarComponentes(); //2. botão direito do mouse: inicia componentes..
		criarEventos(); //1. botão direito do mouse: cria eventos..
	}

private void iniciarComponentes() {
	// objeto
	jbCarro = new JButton("Carro");
	jbCaminhao = new JButton("Caminhão");
	jbOnibus = new JButton("Ônibus");
	jrbBau = new JRadioButton("Bau");
	jrbBau.setOpaque(false);
	jrbBasculante = new JRadioButton("Basculante");
	jrbBasculante.setOpaque(false);
	jrbCarreta = new JRadioButton("Carreta");
	jrbCarreta.setOpaque(false);
	jtaMostrar = new JTextArea("Mostra Dados");
	jsMostrar = new JScrollPane(jtaMostrar);// JtextArea dentro do scholl
	
	
	//adicionar
	add(jbCarro);
	add(jbCaminhao);
	add(jbOnibus);
	add(jrbBasculante);
	add(jrbBau);
	add(jrbCarreta);
	add(jsMostrar);
	
	//dimensionar
	jbCarro.setBounds(20, 40, 100, 20);
	jbOnibus.setBounds(200, 40, 100, 20);
	jbCaminhao.setBounds(20, 80, 100, 20);
	jrbBau.setBounds(200, 80, 100, 20);
	jrbCarreta.setBounds(200, 100, 100, 20);
	jrbBasculante.setBounds(200, 120, 100, 20);
	jsMostrar.setBounds(30, 150, 330, 180);
			
	}



private void criarEventos() {
	// evento do botao carro
	jbCarro.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jtaMostrar.setText("");//apagando a área de texto
			jtaMostrar.setText("************MOSTRAR DADOS************");//apagando a área de texto
			for (Veiculos veiculo : veiculos) { //azul atributo; marrom variável.
				if (veiculo instanceof Carro) {
					jtaMostrar.append(veiculo.mostrarDados());
				}
				
			}
			
			
		}
	});
	jbOnibus.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		jtaMostrar.setText("");//apagando a área de texto
		jtaMostrar.setText("************MOSTRAR DADOS************");//apagando a área de texto
		for (Veiculos veiculo : veiculos) { //azul atributo; marrom variável.
			if (veiculo instanceof Onibus) {
				jtaMostrar.append(veiculo.mostrarDados());

		
			}
		}
		}
			
		});
	
}
}
		
		
		
	
	

