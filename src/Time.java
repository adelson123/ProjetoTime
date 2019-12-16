
public class Time {
	private final String nome;
	private final String categoria;
	private int anoCriacao;
	private int quantSocios;
	private String historico;
	private int idadeTime;

	public Time(final String nome, final String categoria) {
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

	public void setAnoCriacao(final int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	public void setQuantSocios(final int quantSocios) {
		this.quantSocios = quantSocios;
	}

	public void setHistorico(final String historico) {
		this.historico = historico;
	}

	public void contagemRegressiva() {
		System.out.println("Faltam " + (100-this.idadeTime) + " dias para o centenário do time");
	}

	public void caulculaIdade() {

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
	
	public void imprimeInfo(String nome, String categoria,int anoCriacao,
			int quantSocios, String historico, int idadeTime) {
		
		System.out.println("O nome do Time é:" + this.nome);
		System.out.println("O nome do Time é:" + this.categoria);
		System.out.println("O nome do Time é:" + this.anoCriacao);
		System.out.println("O nome do Time é:" + this.quantSocios);
		System.out.println("O nome do Time é:" + this.historico);
		System.out.println("O nome do Time é:" + this.idadeTime);
	}

}
