package testes;

import orientacaoAobjetos.CartaoDeCredito;
import orientacaoAobjetos.Cliente;

public class TesteClienteCartao {

	public static void main(String[] args) {
	
		CartaoDeCredito cardA = new CartaoDeCredito(11);
		Cliente cliA = new Cliente();
		
		cliA.nomeCliente = "Adilson";
		cardA.cliente = cliA;
		
		System.out.println(cardA.cliente.nomeCliente);
		
	}

}
