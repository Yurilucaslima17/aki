package sistema.modelos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Categoria {
	@Id
	private String nome;
	private int nascidosApartirDe;
	private Campeonato campeonato;
	private List<Fase> fases;
	private int minJogadores;
	private int maxJogadores;
	private enum Sexo {F,M;};
	private Sexo sexo;
	
	public Categoria() {}
	
	public Categoria(String nome, int nascidosApartirDe, Campeonato campeonato, List<Fase> fases, int minJogadores,
			int maxJogadores, Sexo sexo) {
		super();
		this.nome = nome;
		this.nascidosApartirDe = nascidosApartirDe;
		this.campeonato = campeonato;
		this.fases = fases;
		this.minJogadores = minJogadores;
		this.maxJogadores = maxJogadores;
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNascidosApartirDe() {
		return nascidosApartirDe;
	}
	public void setNascidosApartirDe(int nascidosApartirDe) {
		this.nascidosApartirDe = nascidosApartirDe;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public List<Fase> getFases() {
		return fases;
	}
	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}
	public int getMinJogadores() {
		return minJogadores;
	}
	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}
	public int getMaxJogadores() {
		return maxJogadores;
	}
	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Categoria [nome=" + nome + ", nascidosApartirDe=" + nascidosApartirDe + ", fases=" + fases
				+ ", minJogadores=" + minJogadores + ", maxJogadores=" + maxJogadores + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
}
