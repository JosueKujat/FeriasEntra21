package testes;

import orientacaoAobjetos.CartaoDeCredito;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
	
		CartaoDeCredito Card01 = new CartaoDeCredito(1);
		CartaoDeCredito Card02 = new CartaoDeCredito(2);
		
		//Card01.codCartao = 0001;
		//Card02.codCartao = 0002;
		
		Card01.dataVali = "22/11/11";
		Card02.dataVali = "11/09/22";
		
		System.out.printf("Codigo: %d\nData de Validade: %s\n",Card01.cdCartao,Card01.dataVali);
		System.out.printf("\nCodigo: %d\nData de Validade: %s\n",Card02.cdCartao,Card02.dataVali);
		
		
	}

}
