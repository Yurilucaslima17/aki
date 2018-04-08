package sistema.modelos;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Campeonato {
	@Id
	private String Nome;
	private List<Local> Locais;
	private List<Juiz> Juizes;
	private List<Categoria> Categorias;
	private Date DataInicioInscrição;
	private Date DataFimInscrição;
	private Date InicioCampeonato;
	private Date FimCampeonato;
	private double valorTaxa;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public List<Local> getLocais() {
		return Locais;
	}
	public void setLocais(List<Local> locais) {
		Locais = locais;
	}
	public List<Juiz> getJuizes() {
		return Juizes;
	}
	public void setJuizes(List<Juiz> juizes) {
		Juizes = juizes;
	}
	public List<Categoria> getCategorias() {
		return Categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		Categorias = categorias;
	}
	public Date getDataInicioInscrição() {
		return DataInicioInscrição;
	}
	public void setDataInicioInscrição(Date dataInicioInscrição) {
		DataInicioInscrição = dataInicioInscrição;
	}
	public Date getDataFimInscrição() {
		return DataFimInscrição;
	}
	public void setDataFimInscrição(Date dataFimInscrição) {
		DataFimInscrição = dataFimInscrição;
	}
	public Date getInicioCampeonato() {
		return InicioCampeonato;
	}
	public void setInicioCampeonato(Date inicioCampeonato) {
		InicioCampeonato = inicioCampeonato;
	}
	public Date getFimCampeonato() {
		return FimCampeonato;
	}
	public void setFimCampeonato(Date fimCampeonato) {
		FimCampeonato = fimCampeonato;
	}
	public double getValorTaxa() {
		return valorTaxa;
	}
	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	@Override
	public String toString() {
		return "Campeonato [Nome=" + Nome + ", Locais=" + Locais + ", Juizes=" + Juizes + ", Categorias=" + Categorias
				+ ", DataInicioInscrição=" + DataInicioInscrição + ", DataFimInscrição=" + DataFimInscrição
				+ ", InicioCampeonato=" + InicioCampeonato + ", FimCampeonato=" + FimCampeonato + ", valorTaxa="
				+ valorTaxa + "]";
	}
	
	
}
