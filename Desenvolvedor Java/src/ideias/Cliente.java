package ideias;

public class Cliente {
	private String nome;
	private double saldo;
	private String grupo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	public void imprimirInfo() {
		
		System.out.println(this.nome);
		System.out.println(this.saldo);
		System.out.println(this.grupo);
	}
}
