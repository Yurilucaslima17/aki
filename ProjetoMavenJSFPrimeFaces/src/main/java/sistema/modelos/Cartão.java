package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cartão {
	@Id
	private Inscrito inscrito;
	private enum Tipo {Jogador, Técnico;};
	private Tipo tipo;
	private int tempo;
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Cartão [inscrito=" + inscrito + ", tipo=" + tipo + ", tempo=" + tempo + "]";
	}
	
}
