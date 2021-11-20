package painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import classe.Basculante;
import classe.Bau;
import classe.Carreta;
import classe.Carro;
import classe.Onibus;
import classe.Veiculo;

public class PainelMostrarDados extends JPanel {
private List<Veiculo> veiculo;
private JTextArea jtaMostrarDados;
private JButton jbCarro, jbOnibus, jbCaminhao;
private JCheckBox jckBau, jckCarreta, jckBasculante;
private JScrollPane jsMostrar; // Cria uma barra de rolagem
public PainelMostrarDados(List<Veiculo> veiculo) {
	super();
	setSize(600, 600);
	setLayout(null);
	this.veiculo= veiculo;
	iniciarComponentes();
	criarEventos();
	setBackground(Color.LIGHT_GRAY);
	
}
private void iniciarComponentes() {
	//objeto
	jtaMostrarDados = new JTextArea();
	jtaMostrarDados.setEditable(false);
	jsMostrar = new JScrollPane(jtaMostrarDados); // Um objeto dentro de outro objeto 
	jbCarro = new JButton("Carro");
	jbOnibus = new JButton("Onibus");
	jbCaminhao = new JButton("Caminhão");
	jckBau = new JCheckBox("Bau");
	jckCarreta = new JCheckBox("Carreta");
	jckBasculante = new JCheckBox("Basculante");
	
	//add
	add(jsMostrar);
	add(jbCarro);
	add(jbOnibus);
	add(jbCaminhao);
	add(jckBau);
	add(jckCarreta);
	add(jckBasculante);
	
	
	//Dimensionar
	jbCarro.setBounds(20,40,100,20);
	jbOnibus.setBounds(20,80,100,20);
	jbCaminhao.setBounds(300,40,100,20);
	jckBau.setBounds(200,80,100,20);
	jckCarreta.setBounds(330,80,100,20);
	jckBasculante.setBounds(460,80,100,20);
	jsMostrar.setBounds(30,120,530,200);
	
}

private void criarEventos() {
	jbCarro.addActionListener( new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jtaMostrarDados.setText("Cadastro de Carros\n");
			for (Veiculo veiculo : veiculo) {
				if (veiculo instanceof Carro) {
					jtaMostrarDados.append(veiculo.MostrarDados());
				}
				
		}		
	}
	
	});
	//Evenyo do mostrar Onibus

	jbOnibus.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jtaMostrarDados.setText("Cadastro de Onibus\n");
			for (Veiculo veiculo : veiculo) {
				if (veiculo instanceof Onibus) {
					jtaMostrarDados.append(veiculo.MostrarDados());
				}
			}
		}
	});
	
	jbCaminhao.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (jckBasculante.isSelected() && jckBau.isSelected() && jckCarreta.isSelected()) {
				jtaMostrarDados.setText("Cadastro de Caminhão\n");
			 //Mostrar Bau
				for (Veiculo veiculo : veiculo) {
					if(jckBau.isSelected()) {
					if (veiculo instanceof Bau) {
						jtaMostrarDados.append(veiculo.MostrarDados());
					}
				}
				}
				//Mostrar 
				if (jckCarreta.isSelected()) {
					for (Veiculo veiculo : veiculo) {
						if (veiculo instanceof Carreta ) {
							jtaMostrarDados.append(veiculo.MostrarDados());
						}
					}
					}
			//mostrar basculante
					if (jckBasculante.isSelected()) {
						for (Veiculo veiculo : veiculo) {
							if (veiculo instanceof Basculante ) {
								jtaMostrarDados.append(veiculo.MostrarDados());
					}
				}
			
			}
			}
		}
		});


}
}


