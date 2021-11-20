package painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import classe.Onibus;
import classe.Veiculo;


public class PainelCadastrOnibus<Veiculos> extends JPanel {
		private JLabel jlOnibus,jlModelo,jlAnoModelo,
		jlAnofabricacao,jlCor,jlFabricante,jlNumeroChassi,jlPlaca,jlCombustivel,jlquantidadedePoltronas;
		private JTextField jtfModelo,
		jtfAnoModelo,jtfAnofabricacao,jtfCor,jtfFabricante,
		jtfNumeroChassi, jtfPlaca;
		private JRadioButton jrbGasolina,jrbAlcool,jrbGasolinaAlcool,jrbDiesel,jrbPoltronas42,jrbPoltronas32,jrbPoltronas25;
		private ButtonGroup bgCombustivel,bgquantidadedePoltronas;
		private JButton jbCadastrar;
		private List<Veiculo> veiculo;
		//Construtor
		public PainelCadastrOnibus(List<Veiculo> veiculo) {
			super ();
			setSize(600, 400);
			setLayout(null);
			setBackground(Color.LIGHT_GRAY);
			this.veiculo = veiculo;
			iniciarComponentes();
			criarEventos();
		}
		private void iniciarComponentes() {
			jlOnibus = new JLabel("Onibus");
			jlModelo = new JLabel("Modelo");
			jlAnoModelo = new JLabel("Ano do modelo");
			jlAnofabricacao = new JLabel("Ano de Fabricação");
			jlCor = new JLabel("Cor");
			jlFabricante = new JLabel("Fabricante");
			jlNumeroChassi = new JLabel("Número de chassi");
			jlCombustivel = new JLabel("Combustível");
			jlPlaca = new JLabel("Placa");
			jlquantidadedePoltronas = new JLabel("Nº de poltronas");
			jtfModelo = new JTextField();
			jtfAnoModelo = new JTextField();
			jtfAnofabricacao = new JTextField();
			jtfCor = new JTextField();
			jtfFabricante = new JTextField();
			jtfNumeroChassi = new JTextField();
			jtfPlaca = new JTextField();
			jrbAlcool = new JRadioButton("Álcool");
			jrbAlcool.setOpaque(false);
			jrbDiesel = new JRadioButton("Diesel");
			jrbDiesel.setOpaque(false);
			jrbGasolina = new JRadioButton("Gasolina",true);
			jrbGasolina.setOpaque(false);
			jrbGasolinaAlcool = new JRadioButton("Gasolina/Álcool");
			jrbGasolinaAlcool.setOpaque(false);
			jrbPoltronas42 = new JRadioButton("42",true);
			jrbPoltronas42.setOpaque(false);
			jrbPoltronas32 = new JRadioButton("32");
			jrbPoltronas32.setOpaque(false);
			jrbPoltronas25 = new JRadioButton("25");
			jrbPoltronas25.setOpaque(false);
			bgCombustivel = new ButtonGroup();
			bgquantidadedePoltronas = new ButtonGroup();
			jbCadastrar = new JButton("CADASTRAR");
			
			//adicionar
			add(jlOnibus);
			add(jlModelo);
			add(jtfModelo);
			add(jlAnoModelo);
			add(jtfAnoModelo);
			add(jlAnofabricacao);
			add(jtfAnofabricacao);
			add(jlCor);
			add(jtfCor);
			add(jlFabricante);
			add(jlNumeroChassi);
			add(jlCombustivel);
			add(jtfFabricante);
			add(jtfNumeroChassi);
			add(jlPlaca);
			add(jtfPlaca);
			add(jrbAlcool);
			add(jrbGasolina);
			add(jrbGasolinaAlcool);
			add(jrbDiesel);
			add(jlquantidadedePoltronas);
			add(jrbPoltronas42);
			add(jrbPoltronas32);
			add(jrbPoltronas25);
			add(jbCadastrar);
			bgCombustivel.add(jrbAlcool);
			bgCombustivel.add(jrbGasolina);
			bgCombustivel.add(jrbGasolinaAlcool);
			bgCombustivel.add(jrbDiesel);
			bgquantidadedePoltronas.add(jrbPoltronas42);
			bgquantidadedePoltronas.add(jrbPoltronas32);
			bgquantidadedePoltronas.add(jrbPoltronas25);
			
			//dimensionar
			jlOnibus.setBounds(270, 10, 60, 20);
			jlModelo.setBounds(20, 40, 80, 20);
			jtfModelo.setBounds(20, 60, 100, 20);
			jlAnoModelo.setBounds(150, 40, 100, 20);
			jtfAnoModelo.setBounds(170, 60, 40, 20);
			jlAnofabricacao.setBounds(270, 40, 120, 20);
			jtfAnofabricacao.setBounds(300, 60, 40, 20);
			jlCor.setBounds(410, 40, 40, 20);
			jtfCor.setBounds(410, 60, 100, 20);
			jlFabricante.setBounds(20,90,100,20);
			jtfFabricante.setBounds(20, 110, 100, 20);
			jlNumeroChassi.setBounds(150,90,120,20);
			jtfNumeroChassi.setBounds(150, 110, 100, 20);
			jlPlaca.setBounds(300,90,80,20);
			jtfPlaca.setBounds(300, 110, 100, 20);
			jlCombustivel.setBounds(20, 140, 100, 20);
			jrbGasolina.setBounds(20, 160, 100, 20);
			jrbGasolinaAlcool.setBounds(20, 180, 120, 20);
			jrbAlcool.setBounds(150, 160, 100, 20);
			jrbDiesel.setBounds(150, 180, 100, 20);
			jlquantidadedePoltronas.setBounds(300, 140, 100, 20);
			jrbPoltronas42.setBounds(300, 160, 40, 20);
			jrbPoltronas32.setBounds(410, 160, 40, 20);
			jrbPoltronas25.setBounds(300, 180, 40, 20);
			jbCadastrar.setBounds(200, 220, 200, 40);
		}


		private void criarEventos() {
jbCadastrar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if (!jtfModelo.getText().isEmpty() &&
							!jtfAnoModelo.getText().isEmpty() &&
							!jtfAnofabricacao.getText().isEmpty() &&
							!jtfCor.getText().isEmpty() &&
							!jtfFabricante.getText().isEmpty() &&
							!jtfNumeroChassi.getText().isEmpty() &&
							!jtfPlaca.getText().isEmpty()) {
						//declaração das variáveis 
						String placa, tipoCombustivel = null, fabricante, numeroChassis, cor,
						 tipoVeiculo,  modelo,  anoFabricacao,  anoModelo;
						int quantidadedePoltronas = 0;
						//entradas
						placa = jtfPlaca.getText();
						fabricante = jtfFabricante.getText();
						numeroChassis = jtfNumeroChassi.getText();
						cor = jtfCor.getText();
						tipoVeiculo = jlOnibus.getText();
						modelo = jtfModelo.getText();
						anoFabricacao = jtfAnofabricacao.getText();
						anoModelo = jtfAnoModelo.getText();
						//quantidade de lugares 
						if(jrbPoltronas42.isSelected()) quantidadedePoltronas = 42;
						if(jrbPoltronas32.isSelected()) quantidadedePoltronas = 32;
						if(jrbPoltronas25.isSelected()) quantidadedePoltronas = 25;
						
						//tipo de gasolina 
						if(jrbGasolina.isSelected())tipoCombustivel = "Gasolina";
						if(jrbGasolinaAlcool.isSelected())tipoCombustivel = "Gasolina/Álcool";
						if(jrbAlcool.isSelected())tipoCombustivel = "Álcool";
						if(jrbDiesel.isSelected())tipoCombustivel = "Diesel";
							//objeto
						veiculo.add(new Onibus(cor, placa, modelo, fabricante, anoModelo, anoFabricacao, numeroChassis, tipoCombustivel, tipoVeiculo, anoModelo));
						//apagar os campos de cadastro
						jtfModelo.setText("");
						jtfAnoModelo.setText("");
						jtfAnofabricacao.setText("");
						jtfCor.setText("");
						jtfFabricante.setText("");
						jtfNumeroChassi.setText("");
						jtfPlaca.setText("");
						
						
					} else {
						JOptionPane.showMessageDialog(null, "Preencha todos os campos",
								" Transportadora", JOptionPane.ERROR_MESSAGE);
					}
					
				}
			});
			
		}
		
}
