package Street_fighter;

public class principal {

	public static void main(String[] args) {
		
		lutador ryu = new lutador("ryu", 100, 10);
		lutador Bison = new lutador("Bison", 100, 12);
		
		ryu.aplicarGolpe("Bison");
		ryu.aplicarGolpe("Bison");
		ryu.aplicarGolpe("Bison");
		
		System.out.println ("energia do bison: " +Bison.energia);
		
		Bison.aplicarGolpe("Ryu");
		Bison.aplicarGolpe("Ryu");
		Bison.aplicarGolpe("Ryu");
		Bison.aplicarGolpe("Ryu");
		Bison.aplicarGolpe("Ryu");
		Bison.aplicarGolpe("Ryu");
		Bison.aplicarGolpe("Ryu");
		Bison.aplicarGolpe("Ryu");

		System.out.println ("energia Ryu: " +ryu.energia);
		
		
		
		
		

	}

	
}
