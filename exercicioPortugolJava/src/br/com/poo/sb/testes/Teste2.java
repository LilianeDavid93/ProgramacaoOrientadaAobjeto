package br.com.poo.sb.testes;

public class Teste2 {

	public static void main(String[] args) {
		String original = "abcd EFGH ijkLM abc";

		String s01 = original.toLowerCase();// formatar String
		String s02 = original.toUpperCase();// formatar String
		String s03 = original.trim();// formatar String
		String s04 = original.substring(2);// 2 e o argumento recortar string
		String s05 = original.substring(2, 9);// recortar string
		String s06 = original.replace('a', 'x'); // trocando (a) por (x) Substituir
		String s07 = original.replace("abc", "xy");// Substituir
		int i = original.indexOf("bc");// buscar
		int j = original.lastIndexOf("bc");

		System.out.println("Original -" + original + "-");
		System.out.println("toLoweCase: - " + s01 + "-");
		System.out.println("toUpperCase: - " + s02 + "-");
		System.out.println("trim: - " + s03 + "-");
		System.out.println("substring (2): -" + s04 + "-");
		System.out.println("substring(2, 9) -" + s05 + "-");
		System.out.println("replace()-" + s06 + "-");
		System.out.println("replace()-" + s07 + "-");
		System.out.println("indexOf bc: - " + i);
		System.out.println("lastIndexOf bc: - " + j);

	}

}
