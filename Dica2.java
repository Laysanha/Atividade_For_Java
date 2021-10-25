package aula2_para_faca;

import javax.swing.JOptionPane;

public class Dica2 {

	public static void main (String [] args) {
		
		int qt = Integer.parseInt (JOptionPane.showInputDialog ("Quantos números deseja somar?"));
		
		int soma = 0;
		
		for (int i = 0; i <qt; i ++) {
			int nr = Integer.parseInt (JOptionPane.showInputDialog ((i + 1) + "º número:"));
			soma = soma + nr;
		}
		JOptionPane.showMessageDialog (null, "O resultado da soma é:" + soma);
		
	}

}
