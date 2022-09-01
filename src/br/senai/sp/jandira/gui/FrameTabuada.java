package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTabuada {

	//atributos da Tela
	public String titulo;
	public int altura;
	public int largura;
	
	//Criação da tela
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		//Criação do container
		Container painel =  tela.getContentPane();
		
		//Criação dos componentes da tela
		JLabel tituloTabuada = new JLabel();
		tituloTabuada.setText("Tabuada");
		tituloTabuada.setBounds(70, 0, 100, 50);
		
		JLabel descricaoTabuada = new JLabel();
		tituloTabuada.setText("Tabuada");
		tituloTabuada.setBounds(70, 0, 100, 50);
		
		painel.add(tituloTabuada);
		tela.setVisible(true);
	}
	
}
