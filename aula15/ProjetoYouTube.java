package aula15;

public class ProjetoYouTube {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 01");
		v[1] = new Video("Aula 02");
		v[2] = new Video("Aula 03");
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].toString());
		}
	
		Gafanhoto g0 = new Gafanhoto("José", "M", 24, "joseph");
		//System.out.println();
		
		//Gafanhoto g1 = new Gafanhoto("Brenda", "F", 28, "muci");
		//System.out.println();
		
		//System.out.println(g1.toString());
		
		//System.out.println(g0.toString());
		//System.out.println();
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g0, v[0]);
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g0, v[1]);
		vis[0].avaliar();
		
		
	}
	
}
