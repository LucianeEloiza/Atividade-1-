package Street_fighter;

public class lutador {

	String nome;
    int energia;
	int for�a;
	
	public lutador(String nome, int energia, int for�a) {
		this.nome = nome;
		this.energia = energia;
		this.for�a = for�a;
	}
		
	public void reduzirEnergia( int for�a){
		energia = energia - for�a;
		
	
	
	}
	public void aplicarGolpe(String lutador) {
		reduzirEnergia(energia);
			
		
		
	}
		
	
    	}

	

