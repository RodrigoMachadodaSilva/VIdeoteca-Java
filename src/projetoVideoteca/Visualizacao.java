package projetoVideoteca;

public class Visualizacao {
	
	private Usuario espectador;
	private Video filme;
	
	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	public Visualizacao(Usuario espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() +1);
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	public void avaliar () {
		this.filme.setAvaliacao(5);
		
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
		
	}
	
	public Usuario getEspectador() {
		return espectador;
	}
	public void setEspectador(Usuario espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}

}
