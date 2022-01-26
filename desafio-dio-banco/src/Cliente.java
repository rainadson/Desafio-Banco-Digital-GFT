import lombok.Getter;
import lombok.Setter;

public class Cliente {

	private String nome;

	@Setter
	@Getter
	private String sobrenome;

	@Setter
	@Getter
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
