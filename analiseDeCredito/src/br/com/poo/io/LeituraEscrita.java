package br.com.poo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.poo.analisedecredito.entidades.Analista;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String NOME = "db";
	static final String EXTENSAO = ".txt";

	public static Map<String,String> leitor() throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + NOME + EXTENSAO));
		
		String linha = "";
		Map<String,String> registros = new HashMap<>();

		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {				
				registros.put(linha.split(",")[1], linha);
			} else {
				break;
			}
		}
		buffRead.close();		
		return registros;
	}

public static void inserirRegistro(String solicitacao){
		
		String linha = "";
	
		try {
			BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + "analises" + EXTENSAO, true));
			buffWriter.append(solicitacao);
			buffWriter.append(linha + "\n");
			buffWriter.close();
		} catch (IOException e) {
			JOptionPane.showInputDialog(null,"Erro ao salvar o cadastro");
			e.printStackTrace();
		}
		
		
	}
}
