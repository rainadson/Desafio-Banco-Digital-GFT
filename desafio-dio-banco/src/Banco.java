import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Banco {
	
	@Setter
	@Getter
	private String nome;
	private List<Conta> contas;
	
	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}


	

}
