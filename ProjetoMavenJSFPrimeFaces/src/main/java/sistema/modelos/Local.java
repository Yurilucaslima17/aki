package sistema.modelos;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Local {
	@Id
	private String endereco;
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Local [endereco=" + endereco + "]";
	}
	public boolean isIgual(Local local, ArrayList<Local> cat) {
		for(Local c: cat) {
			if(c.endereco.equals(local.endereco))
				return false;
		}
		return true;
	}
}
