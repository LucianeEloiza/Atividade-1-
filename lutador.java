package Street_fighter;

public class lutador {

	String nome;
    int energia;
	int força;
	
	public lutador(String nome, int energia, int força) {
		this.nome = nome;
		this.energia = energia;
		this.força = força;
	}
		
	public void reduzirEnergia( int força){
		energia = energia - força;
		
	
	
	}
	public void aplicarGolpe(String lutador) {
		reduzirEnergia(energia);
			
		
		
	}
		
	
    	}

	

