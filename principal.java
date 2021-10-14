package SUAP;

public class principal {

	public static void main(String[] args) {
		
		Aluno A1 = new Aluno ("Luciane Eloiza", "098.608.450-59");
		A1.nota1 = 9;
		A1.nota2 = 8;
		A1.nota3 = 9;
		
		A1.Calcularmedia();
		
		System.out.println("media será de: " + A1.Calcularmedia());
		System.out.println("modificando 2° nota..." );
		
		A1.nota1 = 9;
		A1.nota2 = 10;
		A1.nota3 = 9;
		
		A1.Calcularmedia();
		
		System.out.println("media será de: " + A1.Calcularmedia());
		
        
        
         
	}

}
