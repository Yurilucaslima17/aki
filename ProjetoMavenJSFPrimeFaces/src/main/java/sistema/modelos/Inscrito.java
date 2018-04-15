package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inscrito {
	
	private enum Tipo {ADM, Juiz, Organizador, Jogador, Técnico, Torcedor, Diretor;};;
	private Tipo tipo;
	private Usuario usuario;
	@Id
	private Inscricao inscricao;
	private boolean aceiteUsuario;
	private boolean suspensoJogos;
	private boolean inscricaoValidada;
	public Inscrito() {}
	public Inscrito(Tipo tipo, Usuario usuario, Inscricao inscricao, boolean aceiteUsuario, boolean suspensoJogos,
			boolean inscricaoValidada) {
		super();
		this.tipo = tipo;
		this.usuario = usuario;
		this.inscricao = inscricao;
		this.aceiteUsuario = aceiteUsuario;
		this.suspensoJogos = suspensoJogos;
		this.inscricaoValidada = inscricaoValidada;
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

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}

	public void setAceiteUsuario(boolean aceiteUsuario) {
		this.aceiteUsuario = aceiteUsuario;
	}

	public boolean isSuspensoJogos() {
		return suspensoJogos;
	}

	public void setSuspensoJogos(boolean suspensoJogos) {
		this.suspensoJogos = suspensoJogos;
	}

	public boolean isInscricaoValidada() {
		return inscricaoValidada;
	}

	public void setInscricaoValidada(boolean inscricaoValidada) {
		this.inscricaoValidada = inscricaoValidada;
	}

	@Override
	public String toString() {
		return "Inscrito [tipo=" + tipo + ", inscricao=" + inscricao + ", aceiteUsuario=" + aceiteUsuario
				+ ", suspensoJogos=" + suspensoJogos + ", inscricaoValidada=" + inscricaoValidada + "]";
	}

	
	
	
	
}
