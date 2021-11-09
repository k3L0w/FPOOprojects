package telas;

import java.awt.Color;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import arquivo.LerEscreverArquivo;

//import com.sun.tools.javac.code.Type.ForAll;

import classes.Carro;
import classes.Veiculos;
import paineis.PainelCadastroCarro;
import paineis.PainelCadastroOnibus;
import paineis.PainelMostrar;

public class TelaTransportadora extends JFrame {
//passo: A
private JMenuBar jmBarra;
//cria menu //passo: b
private JMenu jmArquivo, jmCadastro, jmExibir, jmCaminhao;
//cria item do menu
private JMenuItem jmiSair, jmiCarro, jmiMostrarDados, jmiOnibus, jmiBau, jmiCarreta, jmiBasculante;
//matriz dinamica (1ª ação.. da matriz)
private List<Veiculos> veiculos = new ArrayList<>(); //matriz dinamica //ArrayList (java.util...) //endereço da matriz // carros (endereço do objeto da classe carro)
private LerEscreverArquivo arquivo = new LerEscreverArquivo();

//cria painel
private Container contentPane;

	public TelaTransportadora(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		//TELA PADRÃO:
		setSize(600, 600);
		getContentPane().setBackground(Color.orange);
		iniciarComponentes(); //2. botão direito do mouse: inicia componentes..
		criarEventos(); //1. botão direito do mouse: cria eventos..
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fecha janela

	}

	private void iniciarComponentes() {
		//objetos:
		contentPane = getContentPane();
		//passo: A
		jmBarra = new JMenuBar(); //Objeto criado.
		setJMenuBar(jmBarra);//metodo, vem do JFrame.
		
		//passo: b		
		jmArquivo = new JMenu("Arquivo");
		jmCadastro = new JMenu("Cadastro");
		jmExibir = new JMenu("Exibir");
		jmCaminhao = new JMenu("Caminhao");
		jmiSair = new JMenuItem("Sair");
		jmiCarro = new JMenuItem("Carro");
		jmiOnibus = new JMenuItem("Ônibus");
		jmiBau = new JMenuItem("Bau");
		jmiBasculante = new JMenuItem("Basculante");
		jmiCarreta = new JMenuItem("Carreta");
		jmiMostrarDados = new JMenuItem("Mostrar Dados");
		
		//adicionar
		jmBarra.add(jmArquivo);
		jmBarra.add(jmCadastro);
		jmBarra.add(jmExibir);
		jmArquivo.add(jmiSair);
		jmExibir.add(jmiMostrarDados);
		jmCadastro.add(jmiCarro);
		jmCadastro.add(jmiOnibus);
		jmCadastro.add(jmCaminhao);
		jmCaminhao.add(jmiBau);
		jmCaminhao.add(jmiCarreta);
		jmCaminhao.add(jmiBasculante);
			
	}

	private void criarEventos() {
		//criação da ação do item Sair do menu 
		jmiSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!veiculos.isEmpty()) {
					arquivo.escreverObjeto(veiculos);
				} else {
					JOptionPane.showMessageDialog(null, "Lista vazia!");
				}
						
				System.exit(0);
				
			}
		});
		jmiCarro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastroCarro carro = new PainelCadastroCarro(veiculos); //2º passo da matriz...
				contentPane.removeAll();
				contentPane.add(carro);//painel adicionado na tela(Jframe)
				contentPane.validate();
			}
		});
		//criar evento do painel cadastro Onibus
		jmiOnibus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastroOnibus onibus = new PainelCadastroOnibus(veiculos); //2º passo da matriz...
				contentPane.removeAll();
				contentPane.add(onibus);//painel adicionado na tela(Jframe)
				contentPane.validate();
			}
		});
				
		
		
		//evento adiciona o painel de mostrar dados 
		jmiMostrarDados.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Objeto do painel mostrar dados
				PainelMostrar mostrar = new PainelMostrar(veiculos, veiculos);
				contentPane.removeAll();
				contentPane.add(mostrar);
				contentPane.validate();
				
			}
		});
		
		
		
	}
}
	
