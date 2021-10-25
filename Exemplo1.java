package aula2_para_faca;

import javax.swing.JOptionPane;

public class Exemplo1 {
	public static void main(String[] args) {
		int vl = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
		String r = "Listagem dos valor \n\n";
		
		for ( int i = 1; i <= vl; i ++) {
			JOptionPane.showMessageDialog(null, i);
			
			r = r + i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, r);
	}
}
