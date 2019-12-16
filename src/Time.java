
public class Time {
	private String nome;
	private String categoria;
	private int anoCriacao;
	private int quantSocios;
	private String historico;
	private int idadeTime;
	
	
	public Time(String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
		this.anoCriacao = 2000;
		this.quantSocios = 0;
		this.historico = "indefinido";
		this.idadeTime = 2019;
			}
	
	public int calculaIdade() {
		this.idadeTime = this.idadeTime - anoCriacao;
			return idadeTime;
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
