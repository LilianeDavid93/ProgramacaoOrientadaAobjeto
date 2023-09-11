package br.com.poo.sb.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TesteJFrame {

	public static void main(String[] args) {
		
	JLabel label = new JLabel("Bem vindos ao meu sistema", JLabel.CENTER);
	
	label.setFont(new Font("Calibri",Font.BOLD,40));
	
	JFrame janela = new JFrame();
	janela.setSize(700, 700);
	janela.getContentPane().setBackground(new Color (200, 30, 50));
	janela.add(label);
	janela.setVisible(true);
	
}
}