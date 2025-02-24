
public abstract class Conta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected Double saldo;
	protected Cliente cliente;
	protected String tipo;
	
	public Conta(Cliente cliente, Banco banco) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0.0;
		this.cliente = cliente;
		banco.criarCliente(this);
	}
	public void sacar(Double valor) {
		if(saldo >= valor) saldo -= valor;
		else System.out.println("Saldo insuficiente");;
	}
	public void depositar(Double valor) {
		saldo += valor;
	}
	public void transferir(Double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public abstract void imprimirExtrato();
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Títular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	@Override
	public String toString() {
		return "=== Conta ===" +
				"\ncliente: " + cliente.getNome() +
				"\nTipo: " + tipo +
				"\nagencia: " + agencia + 
				"\nnumero: " + numero + 
				"\nsaldo: " + saldo + "\n\n";
				
	}
	
	
}
