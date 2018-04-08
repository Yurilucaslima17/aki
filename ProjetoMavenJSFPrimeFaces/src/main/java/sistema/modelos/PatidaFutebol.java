package sistema.modelos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PatidaFutebol {
	@Id
	private int ID;
	private List<Gol> GolsMandantes;
	private List<Gol> GolsVisitantes;
	private List<Gol> GolsPenaltisMandantes;
	private List<Gol> GolsPenaltisVisitantes;
	private List<Cartão> CartoesMandantes;
	private List<Cartão> CartoesVisitantes;
	public List<Gol> getGolsMandantes() {
		return GolsMandantes;
	}
	public void setGolsMandantes(List<Gol> golsMandantes) {
		GolsMandantes = golsMandantes;
	}
	public List<Gol> getGolsVisitantes() {
		return GolsVisitantes;
	}
	public void setGolsVisitantes(List<Gol> golsVisitantes) {
		GolsVisitantes = golsVisitantes;
	}
	public List<Gol> getGolsPenaltisMandantes() {
		return GolsPenaltisMandantes;
	}
	public void setGolsPenaltisMandantes(List<Gol> golsPenaltisMandantes) {
		GolsPenaltisMandantes = golsPenaltisMandantes;
	}
	public List<Gol> getGolsPenaltisVisitantes() {
		return GolsPenaltisVisitantes;
	}
	public void setGolsPenaltisVisitantes(List<Gol> golsPenaltisVisitantes) {
		GolsPenaltisVisitantes = golsPenaltisVisitantes;
	}
	public List<Cartão> getCartoesMandantes() {
		return CartoesMandantes;
	}
	public void setCartoesMandantes(List<Cartão> cartoesMandantes) {
		CartoesMandantes = cartoesMandantes;
	}
	public List<Cartão> getCartoesVisitantes() {
		return CartoesVisitantes;
	}
	public void setCartoesVisitantes(List<Cartão> cartoesVisitantes) {
		CartoesVisitantes = cartoesVisitantes;
	}
	@Override
	public String toString() {
		return "PatidaFutebol [GolsMandantes=" + GolsMandantes + ", GolsVisitantes=" + GolsVisitantes
				+ ", GolsPenaltisMandantes=" + GolsPenaltisMandantes + ", GolsPenaltisVisitantes="
				+ GolsPenaltisVisitantes + ", CartoesMandantes=" + CartoesMandantes + ", CartoesVisitantes="
				+ CartoesVisitantes + "]";
	}
	
	
	
}
