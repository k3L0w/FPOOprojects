package Telas;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import classes.Doador;

public class TelaDoador extends JFrame {
private JLabel jlNome, jlPeso, jlIdade, jlGenero, jlImagem; //texto (palavras da tela) //atributos
private JTextField jtfNome, jtfPeso, jtfIdade; //caixas de textos //atributos
private JRadioButton jrbFeminino, jrbMasculino; //botões
private ButtonGroup bgGenero; //grupo de butões
private JButton jbVerificar; //cria o botão VERIFICAR
private ImageIcon imagem;



	//CONSTRUTOR (Source -> Superclasss
	public TelaDoador(String title) throws HeadlessException {
		super(title);
		//TELA PADRÃO:
		setSize(270, 260);
		setLayout(null);
		iniciarComponentes(); //botão direito do mouse...
		criarEventos(); //botão direito do mouse...
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void iniciarComponentes() {
		//objeto
		jlNome = new JLabel("Nome");
		jlPeso = new JLabel("Peso");
		jlIdade = new JLabel("Idade");
		jlGenero = new JLabel("Genero");
		
		jtfNome = new JTextField();
		jtfIdade = new JTextField();
		jtfPeso = new JTextField();
		
		jrbFeminino = new JRadioButton("Feminino", true);
		jrbMasculino = new JRadioButton("Masculino");
		bgGenero = new ButtonGroup();
		jbVerificar = new JButton("Verificar");
		imagem = new ImageIcon(getClass().getResource("/imagem/novodoador.png"));
		jlImagem = new JLabel(imagem);
				
		
		//adicionar compontes
		add(jlNome);
		add(jlIdade);
		add(jlPeso);
		add(jlGenero);
		
		add(jtfNome);
		add(jtfIdade);
		add(jtfPeso);
		
		add(jrbFeminino);
		add(jrbMasculino);
		add(jbVerificar);
		
		//grupo genero
		bgGenero.add(jrbFeminino);
		bgGenero.add(jrbMasculino);
		add(jlImagem);
		
		
		//dimensionar componentes
		jlNome.setBounds(20, 20, 50, 20); //coluna, linha, comprimento, largura
		jtfNome.setBounds(20, 40, 200, 20); //coluna, linha, comprimento, largura
		
		jlPeso.setBounds(20, 60, 50, 20);
		jtfPeso.setBounds(20, 80, 50, 20);
		
		jlIdade.setBounds(100, 60, 50, 20);
		jtfIdade.setBounds(100, 80, 50, 20);
		
		jlGenero.setBounds(20, 100, 100, 20);
		
		jrbMasculino.setBounds(20, 120, 100, 20);
		jrbFeminino.setBounds(140, 120, 100, 20);
		jbVerificar.setBounds(30, 150, 180, 20);
		jlImagem.setBounds(0, 0, 260, 260);
		
		
				
		
	}

	private void criarEventos() {
		// CRIANDO o evento do botão VERIFICAR
		jbVerificar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// DECLARAR as variáveis
				String nome, genero;
				float peso;
				int idade;
				
				//resgatar os dados da caixa de texto
				nome = jtfNome.getText();
				peso = Float.parseFloat(jtfPeso.getText());
				idade = Integer.parseInt(jtfIdade.getText());
				if (jrbFeminino.isSelected()) {
					genero = "FEMININO";
				} else {
					genero = "MASCULINO";
				}
				
				//OBJETO
				Doador doador = new Doador(nome, genero, peso, idade);
				
				if (doador.verificarDoarSangue()) {
					//mostrar dados
					JOptionPane.showMessageDialog(null, doador.mostrarDadosEntrada() + "\n" +doador.mostrarQuantidadeSangue());
					
				} else {
					JOptionPane.showMessageDialog(null, "Não pode doar sangue!");
				}
								
				
				
			}
		}); //classe anonima (new)
		
	}
	
	
	
	
	

}
