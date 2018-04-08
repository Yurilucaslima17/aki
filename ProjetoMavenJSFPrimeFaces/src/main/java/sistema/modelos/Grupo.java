package sistema.modelos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Grupo {

	private String nome;
	private Fase fase;
	private List<Rodada> rodadas;
	@Id
	private int numero;
	public Grupo(String nome, Fase fase, List<Rodada> rodadas, int numero) {
		super();
		this.nome = nome;
		this.fase = fase;
		this.rodadas = rodadas;
		this.numero = numero;
	}
	public Grupo(){}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public List<Rodada> getRodadas() {
		return rodadas;
	}
	public void setRodadas(List<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Grupo [nome=" + nome + ", fase=" + fase + ", numero=" + numero + "]";
	}
	
	
	
}
