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
import javax.swing.JTextArea;

import classes.Carro;

public class PainelMostrar extends JPanel { //em Source / Generate construtor...
private JButton jbCarro, jbOnibus, jbCaminhao;
private JRadioButton jrbBau, jrbCarreta, jrbBasculante;
private JTextArea jtaMostrar; 
private Scrollbar scrollbar;

private List<Carro> carros;


	public PainelMostrar(List<Carro> carros) {
		super();
		// super();
		setSize(400, 400);
		setLayout(null);
		setBackground(Color.cyan);
		this.carros = carros;
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
	scrollbar = new Scrollbar();
	
	
	//adicionar
	add(jbCarro);
	add(jbCaminhao);
	add(jbOnibus);
	add(jrbBasculante);
	add(jrbBau);
	add(jrbCarreta);
	add(jtaMostrar);
	
	//dimensionar
	jbCarro.setBounds(20, 40, 100, 20);
	jbOnibus.setBounds(200, 40, 100, 20);
	jbCaminhao.setBounds(20, 80, 100, 20);
	jrbBau.setBounds(200, 80, 100, 20);
	jrbCarreta.setBounds(200, 100, 100, 20);
	jrbBasculante.setBounds(200, 120, 100, 20);
	jtaMostrar.setBounds(30, 140, 330, 230);
	
		

		
	}

private void criarEventos() {
	// evento do botao carro
	jbCarro.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jtaMostrar.setText("");//apagando a área de texto
			jtaMostrar.setText("************MOSTRAR DADOS************");//apagando a área de texto
			for (int i = 0; i < carros.size(); i++) { //retorna o tamanho da matriz
				jtaMostrar.append(carros.get(i).mostrarDados());
				
			}
			
			
		}
	});
	
}
	
	

}
