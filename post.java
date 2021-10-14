package Facebook;

public class post {

	String texto;
	String link;
	int numerocurtidas;
	int numerocompartilhamentos;
	
	
	public post(String texto, String link) {
		this.texto = texto;
		this.link = link;
	}
	
	public  int curtir(int curtidas ) {
		numerocurtidas = 1 + curtidas;
		return numerocurtidas;
		
		
	}
	public int compartilhar(int compartilhamentos  ) {
		 numerocompartilhamentos = 1 + compartilhamentos;
		 return numerocompartilhamentos;
		
	}
	
}
