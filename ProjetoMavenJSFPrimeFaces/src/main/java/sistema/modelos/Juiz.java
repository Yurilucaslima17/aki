package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Juiz {
	
	private enum Tipo {Juiz;};
	private Tipo tipo;
	@Id
	private Usuario usuario;
	public Juiz() {}
	public Juiz(Tipo tipo, Usuario usuario) {
		super();
		this.tipo = tipo;
		this.usuario = usuario;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Juiz [tipo=" + tipo + "]";
	}

	
	
	
	
}
