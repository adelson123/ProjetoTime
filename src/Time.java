
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
