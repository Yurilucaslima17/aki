package sistema.modelos;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Fase {
	
	private Date dataInicio;
	private Date dataFim;
	private enum Formato {};
	private Formato formato;
	private Categoria categoria;
	private List<Grupo> grupos;
	@Id
	private int numero;
	public Fase() {}
	public Fase(Date dataInicio, Date dataFim, Formato formato, Categoria categoria, List<Grupo> grupos, int numero) {
		super();
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.formato = formato;
		this.categoria = categoria;
		this.grupos = grupos;
		this.numero = numero;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public List<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Fase [dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", formato=" + formato + ", categoria="
				+ categoria + ", grupos=" + grupos + ", numero=" + numero + "]";
	}
	
	
	
}
