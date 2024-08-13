//Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da
//mulplicação de A por B.
package controller;

public class SomaController {
	public SomaController() {
		super();
	}
	
	public int multiplicacao(int a, int b,int soma) {
		if (b==0) {
			return 0;
		} else {
			soma = multiplicacao(a,b-1,soma) + a;
		}
		return soma;
	}
}

