package aula2_para_faca;

import javax.swing.JOptionPane;

/*
 * Fa�a um programa em que o usuario informe um valor 
 * e ao final mostre a soma dos n�meros pares iniciando de 2 at� o 
 * valor informado pelo us�rio
 */

public class Ativiade1 {

	public static void main (String [] args) {
		
		int qt = Integer.parseInt (JOptionPane.showInputDialog ("Quantos n�meros deseja somar?"));
		
		int soma = 0;
		
		for (int i = 0; i <qt; i ++) {
			int nr = Integer.parseInt (JOptionPane.showInputDialog ((i + 1) + "� n�mero:"));
			soma = soma + nr;
		}
		JOptionPane.showMessageDialog (null, "O resultado da soma �:" + soma);
		
	}

}
