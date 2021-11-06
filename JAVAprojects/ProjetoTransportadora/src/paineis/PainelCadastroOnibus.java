package paineis;

import java.awt.Color;
import java.awt.LayoutManager;
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

import classes.Carro;
import classes.Onibus;
import classes.Veiculos;

public class PainelCadastroOnibus extends JPanel {
	private JLabel jlOnibus, jlFabricante, jlAnoModelo, jlAnoFabricacao, jlModelo, jlPlaca, jlNumeroLugares, jlChassi, jlCor, jlCombustivel;
	private JTextField jtfFabricante, jtfAnoModelo, jtfAnofabricacao, jtfModelo,jtfPlaca, jtfChassi, jtfCor;
	private JRadioButton jrbGrande,jrbMedio,jrbPequeno, jrbGasolina, jrbGasolinaAlcool, jrbAlcool, jrbDiesel;
	private ButtonGroup bgNumeroLugares, bgCombustivel;
	private JButton jbCadastrar;
	private List<Veiculos> veiculos; //carros é atributo
	

	public PainelCadastroOnibus(List<Veiculos> veiculos) {
		super();
		setSize(400, 400);
		setLayout(null);
		setBackground(Color.cyan);
		this.veiculos = veiculos;
		iniciarComponentes(); //2. botão direito do mouse: inicia componentes..
		criarEventos(); //1. botão direito do mouse: cria eventos..
	
	}
	

	private void iniciarComponentes() {
		// objetos
				jlOnibus = new JLabel("Onibus");
				jlAnoFabricacao = new JLabel("Ano Fabricação");
				jlFabricante = new JLabel("Fabricante");
				jlAnoModelo = new JLabel("Ano Modelo");
				jlModelo = new JLabel("Modelo");
				jlPlaca = new JLabel("Placa");
				jlNumeroLugares = new JLabel("N. lugares");
				//jlNumeroLugares = new JLabel("N. Lugares");
				jlCombustivel = new JLabel("Combustivel"); 
				jlCor = new JLabel("Cor");
				jlChassi = new JLabel("Chassi");
						
				jtfFabricante = new JTextField();
				jtfAnofabricacao = new JTextField();
				jtfAnoModelo = new JTextField();
				jtfAnoModelo = new JTextField();
				jtfModelo = new JTextField();
				jtfPlaca = new JTextField();
				jtfChassi = new JTextField();	
				jtfCor = new JTextField();
				jrbGrande = new JRadioButton("7",true);
				jrbGrande.setOpaque(false);
				jrbMedio = new JRadioButton("5");
				jrbMedio.setOpaque(false);
				jrbPequeno = new JRadioButton("4");
				jrbPequeno.setOpaque(false);
				jrbGasolina = new JRadioButton("Gasolina");
				jrbGasolinaAlcool = new JRadioButton("GAsolina/acoool", true);
				jrbAlcool = new JRadioButton("Alcool");
				jrbAlcool.setOpaque(false);
				jrbDiesel = new JRadioButton("Diesel");
				jbCadastrar = new JButton("CADASTRAR");
				
				bgNumeroLugares = new ButtonGroup();
				bgCombustivel = new ButtonGroup();
				
				//adicionar componentes;
				add(jlOnibus);
				add(jlAnoFabricacao);
				add(jlAnoModelo);
				add(jlFabricante);
				add(jtfFabricante);
				add(jtfAnoModelo);
				add(jtfAnofabricacao);
				
				add(jlModelo);
				add(jlPlaca);
				add(jlNumeroLugares);
				add(jtfModelo);
				add(jtfPlaca);
				add(jrbGrande);
				add(jrbMedio);
				add(jrbPequeno);
				add(jlChassi);
				add(jlCor);
				add(jlCombustivel);
				add(jtfChassi);
				add(jtfCor);
				add(jrbAlcool);
				add(jrbDiesel);
				add(jrbGasolina);
				add(jrbGasolinaAlcool);
				add(jbCadastrar);
						
				bgNumeroLugares.add(jrbGrande);
				bgNumeroLugares.add(jrbMedio);
				bgNumeroLugares.add(jrbPequeno);
				bgCombustivel.add(jrbGasolina);
				bgCombustivel.add(jrbGasolinaAlcool);
				bgCombustivel.add(jrbAlcool);
				bgCombustivel.add(jrbDiesel);
				
				
				//dimensionar
				jlOnibus.setBounds(170, 10, 60, 20);
				jlFabricante.setBounds(20, 40, 100, 20);
				jtfFabricante.setBounds(20, 60, 100, 20); //caixa de texto
				
				jlAnoModelo.setBounds(150, 40, 100, 20);
				jtfAnoModelo.setBounds(150, 60, 50, 20); //caixa de texto
				
				jlAnoFabricacao.setBounds(260, 40, 100, 20);
				jtfAnofabricacao.setBounds(270, 60, 50, 20); //caixa de texto
				
				jlModelo.setBounds(20, 90, 100, 20);
				jtfModelo.setBounds(20, 110, 100, 20); //caixa de texto
				
				jlPlaca.setBounds(150, 90, 100, 20);
				jtfPlaca.setBounds(150, 110, 80, 20); //caixa de texto
				
				jlNumeroLugares.setBounds(260, 90, 100, 20);
				jrbGrande.setBounds(260, 110, 100, 20);
				jrbMedio.setBounds(260, 130, 400, 20);
				jrbPequeno.setBounds(260, 150, 400, 20);
				
				jlChassi.setBounds(20, 140, 100, 20);
				jtfChassi.setBounds(20, 160, 50, 20); //caixa de texto
				
				jlCor.setBounds(150, 140, 50, 20);
				jtfCor.setBounds(150, 160, 80, 20); //caixa de texto
				jlCombustivel.setBounds(20, 190, 100, 20); //caixa de texto
				jrbGasolina.setBounds(20, 210, 100, 20);
				jrbGasolinaAlcool.setBounds(150, 210, 120, 20);
				jrbAlcool.setBounds(20, 230, 100, 20);
				jrbDiesel.setBounds(150, 230, 100, 20);
				jbCadastrar.setBounds(100, 260, 200, 20);
				
				
				
			}
		
	

	private void criarEventos() {
jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// quando clicar no botão aqui que a coisa acontece..
				
				//---------------------------------------
				//VALIDAÇÃO DOS CAMPOS QUE ESTÃO EM BRANCO:
				//---------------------------------------
				if (!jtfFabricante.getText().isEmpty()&&
						!jtfAnoModelo.getText().isEmpty() &&
						!jtfAnofabricacao.getText().isEmpty() &&
						!jtfModelo.getText().isEmpty()&&
						!jtfPlaca.getText().isEmpty()&&
						!jtfChassi.getText().isEmpty()&&
						!jtfCor.getText().isEmpty()) {
				//---------------------------------------
				
					//declaração de variáveis
				String tipoVeiculo,fabricante,anoModelo,anoFabricacao,modelo,placa,numeroChassis,cor,tipoComustivel;
				int numeroPoltronas = 0;
				//entradas
				fabricante = jtfFabricante.getText();
				anoModelo = jtfAnoModelo.getText();
				anoFabricacao = jtfAnofabricacao.getText();
				modelo = jtfModelo.getText();
				placa = jtfPlaca.getText();
				tipoVeiculo = jlOnibus.getText();
				numeroChassis = jtfChassi.getText();
				cor = jtfCor.getText();
				
				//tipo de carro por numero de lugares
				if (jrbGrande.isSelected()) numeroPoltronas = 42;
				if (jrbMedio.isSelected()) numeroPoltronas = 32;
				if (jrbPequeno.isSelected()) numeroPoltronas = 25;
				
				//tipo de combustivel
				if (jrbGasolina.isSelected()) tipoComustivel = "Gasolina";
				if (jrbGasolinaAlcool.isSelected()) tipoComustivel = "Gasolina/Alcool";
				if (jrbAlcool.isSelected()) tipoComustivel = "Alcool";
				if (jrbDiesel.isSelected()) tipoComustivel = "Diesel";
				
				//adicionando na matriz dinâmica o endereço do objeto do carro.
				veiculos.add(new Onibus(placa, cor, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo, numeroPoltronas));
				jtfAnofabricacao.setText("");
				jtfAnoModelo.setText("");
				jtfChassi.setText("");
				jtfCor.setText("");
				jtfFabricante.setText("");
				jtfPlaca.setText("");
				jtfModelo.setText("");
								
				
				
					
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Cadastro de Carro", JOptionPane.ERROR_MESSAGE);

				}
				
			}
		});
		
	
		
	}

	
	

}
