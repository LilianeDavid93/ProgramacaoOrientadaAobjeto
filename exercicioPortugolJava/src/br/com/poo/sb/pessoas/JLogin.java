package br.com.poo.sb.pessoas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class JLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCpf;
	private JPasswordField passwordField;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JLogin() {
		setTitle("Sistema Bancario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 127, 168));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloLogin = new JLabel("Login");
		tituloLogin.setBounds(266, 10, 75, 30);
		tituloLogin.setForeground(new Color(92, 53, 102));
		tituloLogin.setFont(new Font("DialogInput", Font.BOLD, 25));
		contentPane.add(tituloLogin);
		
		textCpf = new JTextField();
		textCpf.setBounds(197, 108, 227, 48);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel labelCpf = new JLabel("CPF");
		labelCpf.setBounds(197, 91, 70, 15);
		contentPane.add(labelCpf);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setBounds(197, 212, 70, 15);
		contentPane.add(labelSenha);
		
		JButton botaoEntrar = new JButton("Entrar");
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = textCpf.getText();
				String senha = new String(textSenha.getPassword());
				if(cpf != null && senha != null && !cpf.isEmpty() && !senha.isEmpty()) {
					JOptionPane.showMessageDialog(botaoEntrar, "Bem vindo(a) " + cpf);
				}else {JOptionPane.showMessageDialog(botaoEntrar, "Preencha todos os campos" + "Aviso" + JOptionPane.WARNING_MESSAGE);}
			}
		});
		botaoEntrar.setBounds(236, 348, 117, 25);
		contentPane.add(botaoEntrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(272, 244, -52, 19);
		contentPane.add(passwordField);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(197, 263, 227, 48);
		contentPane.add(textSenha);
	}
}
