import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome = "Nubank";
	private List<Conta> contas = new ArrayList<>();
	
	public void criarCliente(Conta conta) {
		this.contas.add(conta);
	}
	public void imprimirClientes() {
		this.contas.stream().forEach(System.out::println);
	}
	public String getNome() {
		return nome;
	}
	
}
