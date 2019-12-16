
public class Time {
	private String nome;
	private String categoria;
	private int anoCriacao;
	private int quantSocios;
	private String historico;
	
	public Time(String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
		this.anoCriacao = 0;
		this.quantSocios = 0;
		this.historico = "indefinido";
	}
}
