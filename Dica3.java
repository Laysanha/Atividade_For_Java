package aula2_para_faca;

import javax.swing.JOptionPane;

public class Dica3 {
	public static void main (String [] args) {
		
		int idadeMaisVelho = -1;
		String nomeMaisVelho = "";
		
		int qt = Integer.parseInt (JOptionPane.showInputDialog ("Quantas pessoas?"));
		
		
		for (int i = 0; i <qt; i ++) {
			String nome = JOptionPane.showInputDialog ((i + 1) + "º nome:");
			int idade = Integer.parseInt (JOptionPane.showInputDialog ("Idade de" + nome));
			if (idade> idadeMaisVelho) {
				idadeMaisVelho = idade;
				nomeMaisVelho = nome;
			}
		}
		
		JOptionPane.showMessageDialog (null, "Pessoa vais velha" + nomeMaisVelho + "n/ Idade:" + idadeMaisVelho);
		
	}
}
