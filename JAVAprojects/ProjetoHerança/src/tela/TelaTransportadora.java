 package tela;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import arquivo.LerEscreverArquivo;
import classe.Basculante;
import classe.Carro;
import classe.Veiculo;
import painel.PainelCadastrOnibus;
import painel.PainelCadastroBasculante;
import painel.PainelCadastroBau;
import painel.PainelCadastroCarro;
import painel.PainelDeletarCadastro;
import painel.PainelMostrarDados;
import painel.PainelPesquisa;

public class TelaTransportadora<Veiculos>  extends JFrame {
private JMenuBar jmBarra;
private JMenu jmArquivo,jmCadastrar,jmCaminhao, jmExibir;
private JMenuItem jmiSair,jmiCarro,jmiOnibus,jmiBau,jmiCarreta,jmiBasculante,jmiMostrarDados, jmiPesquisa, jmiDeletar;
 private Container contentPane;	
private List<Veiculo> veiculo = new ArrayList<>(); //matriz Dinamica
LerEscreverArquivo arquivo = new LerEscreverArquivo();  //objeto da classe de manipulação de arquivo

	
	public TelaTransportadora(String title) throws HeadlessException {
		super(title);
		setSize(600, 400);
		//setLayout(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		abrirArquivo();
		iniciarComponentes();
		criarEventos();
		setLocationRelativeTo(getContentPane());//centralizar a tela 
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE );
	}

	private void abrirArquivo() {
		if (!(arquivo.lerArquivo() == null)) {
			veiculo = arquivo.lerArquivo();
		}
		
	}

	private void iniciarComponentes() {
		contentPane = getContentPane();
		jmBarra = new JMenuBar();
		setJMenuBar(jmBarra);
		jmArquivo = new JMenu("Arquivo");
		jmArquivo.setMnemonic('A');
		jmCadastrar = new JMenu("Cadastro");
		jmCadastrar.setMnemonic('C');
		jmCaminhao = new JMenu("Caminhão");
		jmExibir = new JMenu("Exibir");
		jmiMostrarDados = new JMenuItem("Dados");
		jmiSair = new JMenuItem("Sair");
		jmiSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));
		jmiCarro = new JMenuItem("Carro");
		jmiOnibus = new JMenuItem("Onibus");
		jmiBau = new JMenuItem("Baú");
		jmiBasculante = new JMenuItem("Basculante");
		jmiCarreta = new JMenuItem("Carreta");
		jmiPesquisa = new JMenuItem("Pesquisa");
		jmiDeletar = new JMenuItem("Deletar");
		
		jmBarra.add(jmArquivo);
		jmBarra.add(jmCadastrar);
		jmBarra.add(jmExibir);
		jmArquivo.add(jmiSair);
		jmCadastrar.add(jmiCarro);
		jmCadastrar.add(jmiOnibus);
		jmCadastrar.add(jmCaminhao);
		jmCaminhao.add(jmiBau);
		jmCaminhao.add(jmiBasculante);
		jmCaminhao.add(jmiCarreta);
		jmExibir.add(jmiMostrarDados);
		jmExibir.add(jmiPesquisa);
		jmExibir.add(jmiDeletar);
		
	}

	private void criarEventos() {
		//Sair programa
		jmiSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja salvar e sair? ","Sair ", JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					arquivo.escreverArquivo(veiculo);
						
				}
				System.exit(0);
								
			}
		});
		
		jmiCarro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastroCarro carro = new PainelCadastroCarro(veiculo);
				contentPane.removeAll();
				contentPane.add(carro);
				contentPane.validate();
				
			}
		});
		// Objeto do painel
		jmiMostrarDados .addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			PainelMostrarDados dados = new PainelMostrarDados(veiculo);
				contentPane.removeAll(); // Remove todos os objetos do painel(container)
				contentPane.add(dados); // o Adiciona ao menu o acesso a painel carro
				contentPane.validate(); // Valida todos os componentes do painel da  painel carro 
				
			}
		});
		//Evento do onibus
	jmiOnibus.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		PainelCadastrOnibus onibus = new PainelCadastrOnibus(veiculo);
		contentPane.removeAll(); // Remove todos os objetos do painel(container)
		contentPane.add(onibus); // o Adiciona ao menu o acesso a painel carro
		contentPane.validate(); // Valida todos os componentes do painel da  painel carro
		}
	});
	
	//Evento do Caminhão Basculante
	jmiBasculante.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		PainelCadastroBasculante basculante = new PainelCadastroBasculante(veiculo);
		contentPane.removeAll();// Remove todos os objetos do painel(container)
		contentPane.add(basculante); // o Adiciona ao menu o acesso a painel carro
		contentPane.validate(); // Valida todos os componentes do painel da  painel carro
			
		}
	});
	
	jmiBau.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			PainelCadastroBau bau = new PainelCadastroBau(null);
			contentPane.removeAll();// Remove todos os objetos do painel(container)
			contentPane.add(bau); // o Adiciona ao menu o acesso a painel carro
			contentPane.validate(); // Valida todos os componentes do painel da  painel carro
		}
	});
	//Evento de Pesquisa
	
	jmiPesquisa.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			PainelPesquisa pesquisa = new PainelPesquisa(veiculo);
			contentPane.removeAll();// Remove todos os objetos do painel(container)
			contentPane.add(pesquisa); // o Adiciona ao menu o acesso a painel carro
			contentPane.validate(); // Valida todos os componentes do painel da  painel carro
		}
	});
	//Evento Deletar
	jmiDeletar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			PainelDeletarCadastro deletar = new PainelDeletarCadastro(veiculo);
			contentPane.removeAll();// Remove todos os objetos do painel(container)
			contentPane.add (deletar); // o Adiciona ao menu o acesso a painel carro
			contentPane.validate(); // Valida todos os componentes do painel da  painel carro
			
		}
	});
	}
	
	}

	
	