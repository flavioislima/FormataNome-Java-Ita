package Lesson;

public class Respeitoso implements FormatadorNome{
	public String sexo;
	
	public Respeitoso(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String formatNome(String nome, String sobrenome) {
		if (sexo == "masculino")
				return "Sr. " + nome + " " + sobrenome;		
			return "Sra. " + nome + " " + sobrenome;
		}

}
