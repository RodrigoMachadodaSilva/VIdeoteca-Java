package projetoVideoteca;

public class ProjetoVideoteca {

	public static void main(String[] args) {
		
		Video video[] = new Video [3];
		video[0] = new Video("Aula 1 de POO");
		video[1] = new Video("Aula 2 de PHP");
		video[2] = new Video("Aula 3 de PYTHON");
		
		System.out.println(video[0].toString());
		
		Usuario usuario [] = new Usuario[2];
		usuario[0] = new Usuario("Rodrigo", 39, "M", "Ro");
		usuario[1]= new Usuario("Maria", 23, "F", "Ma");
		
		System.out.println(usuario[0].toString());
		
		Visualizacao visualizacao[] = new Visualizacao [2];
		visualizacao[0] = new Visualizacao(usuario[0], video[1] );
		visualizacao[0].avaliar();
		visualizacao[1] = new Visualizacao(usuario[1], video[1] );
		visualizacao[1].avaliar(7);
		
		System.out.println(visualizacao[0].toString());
	}
}
