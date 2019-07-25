package testes;

import orientacaoAobjetos.Turma;

public class TesteTurma {

	public static void main(String[] args) {

		Turma turma01 =  new Turma();
		Turma turma02 =  new Turma();
		
		turma01.periodo = "matutino";
		turma01.serie = 1;
		turma01.sigla = "Mat";
		turma01.tipoDeEnsino = "Superior";
		

		turma02.periodo = "vespertino";
		turma02.serie = 2;
		turma02.sigla = "Vep";
		turma02.tipoDeEnsino = "Medio";
		
		System.out.printf("Perido: %s\nSerie: %dº\nsigla: %s\nTipo do ensino: %s\n",turma01.periodo,turma01.serie,turma01.sigla,turma01.tipoDeEnsino);
		System.out.printf("\nPerido: %s\nSerie: %dº\nsigla: %s\nTipo do ensino: %s\n",turma02.periodo,turma02.serie,turma02.sigla,turma02.tipoDeEnsino);
		
		
		
	}

}
