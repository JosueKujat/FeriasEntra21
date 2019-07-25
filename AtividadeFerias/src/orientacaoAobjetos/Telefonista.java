package orientacaoAobjetos;

public class Telefonista extends Funcionario{

		int cdEstacao;
		
		@Override
		public void ConsultaDados() {
			System.out.printf("Nome: %s \nSalario: %f\nVale Refeicão: %f\nBonificação: %f\nCodigo de Estação: %d\n",getNomeFuncionario(),getSalarioFuncionario(),getValeRefeicao(),this.Bonificacao,this.cdEstacao);
			
		}


}
