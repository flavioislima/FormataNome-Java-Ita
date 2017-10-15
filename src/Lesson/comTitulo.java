package Lesson;

public class comTitulo implements FormatadorNome {
	
	private String titulo;
	
	public comTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String formatNome(String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome; 
	}

}
