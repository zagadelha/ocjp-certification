package lombok;

@SuppressWarnings("unused")
@Getter
@Setter
public class Pessoa {

	private String nome;
	private String sobrenome;

	public Pessoa(String n, String s) {
		this.nome = n;
		this.sobrenome = s;
	}

}
