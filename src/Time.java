
public class Time {
	private String nome;
	private String categoria;
	private int anoCriacao;
	private int quantSocios;
	private String historico;
	
	public Time(String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public int getQuantSocios() {
		return quantSocios;
	}

	public String getHistorico() {
		return historico;
	}
	


	
}
