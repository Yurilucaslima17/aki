package sistema.modelos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Rodada {
	@Id
	private int numero;
	private Grupo grupo;
	private List<Partida> Partida;
	public Rodada() {}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public List<Partida> getPartida() {
		return Partida;
	}
	public void setPartida(List<Partida> partida) {
		Partida = partida;
	}
	@Override
	public String toString() {
		return "Rodada [numero=" + numero + ", grupo=" + grupo + "]";
	}
	
	
}
