package orientacaoAobjetos;

public class Telefonista extends Funcionario{

		int cdEstacao;
		
		@Override
		public void ConsultaDados() {
			System.out.printf("Nome: %s \nSalario: %f\nVale Refeic�o: %f\nBonifica��o: %f\nCodigo de Esta��o: %d\n",getNomeFuncionario(),getSalarioFuncionario(),getValeRefeicao(),this.Bonificacao,this.cdEstacao);
			
		}


}
