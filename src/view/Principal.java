package view;
import javax.swing.JOptionPane;

import controller.SomaController;
public class Principal {
	public static void main(String args[]) {
		SomaController somCont = new SomaController();
		
		int na = Integer.parseInt(JOptionPane.showInputDialog("digite valor de A "));
		int nb = Integer.parseInt(JOptionPane.showInputDialog("digite valor de B"));
		int nc = 0;
		
		int resul = somCont.multiplicacao(na, nb, nc);
		System.out.println(resul);
	}
}
