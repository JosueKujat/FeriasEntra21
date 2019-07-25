package orientacaoAobjetos;

public class Conta {

	public int cdConta;
	public double saldo;
	public double limite = 100;
	public Agencia agencia;
	public static int qtdObjetos;
	
	public Conta(int cod) {
		cdConta = cod;
		//J� tinha feito
		qtdObjetos++;
	}
	
	
	public static void ZerarContador() {
		System.out.println("Quantidade de Objetos criados: "+qtdObjetos+"\n\n");
		qtdObjetos = 0;
	}
	
	public static void TraferenciaEntreContas(int Valor,Conta ContaQueDa,Conta ContaQueRecebe) {
		ContaQueDa.saldo -= Valor;
		ContaQueRecebe.saldo += Valor;
	}
	
	
	public void Saque(double valor) {
		this.saldo -= valor;
	}
	
	public void Deposito(double valor) {
		this.saldo += valor;
	}
	
	public void Impress�oDeExtrato() {
		//
	}
	
	public double SaldoDisponivel() {
		return this.saldo;
	}
	
}
