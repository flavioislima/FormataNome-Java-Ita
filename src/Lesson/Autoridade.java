package Lesson;

public class Autoridade {
	String nome;
	String sobrenome;
	FormatadorNome tratamento;
	

	public Autoridade(String nome, String sobrenome, FormatadorNome tratamento){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tratamento = tratamento;
	}
	
	protected String getTratamento() {
		return tratamento.formatNome(nome, sobrenome);
	}
	
}