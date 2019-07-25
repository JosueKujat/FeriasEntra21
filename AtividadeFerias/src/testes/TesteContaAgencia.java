package testes;

import orientacaoAobjetos.Agencia;
import orientacaoAobjetos.Conta;

public class TesteContaAgencia {

	public static void main(String[] args) {

		Agencia age01 = new Agencia(100);
		Conta con01 = new Conta(1);

		con01.agencia = age01;

		System.out.println(con01.agencia.cdAg);
	}

}
