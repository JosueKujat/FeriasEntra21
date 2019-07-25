package testes;

import classesAbstratas.FuncionarioGen;
import classesAbstratas.GerenteDeBanco;

public class TesteFuncionarioGenerico {

	public static void main(String[] args) {
		
		
		FuncionarioGen fun01 = new GerenteDeBanco();

		fun01.Bonificacao();
	}

}
