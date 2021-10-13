package CLINICAMEDICA;

public class PRINCIPAL {
	public static void main(String[] args) {
	
		Paciente p1 = new Paciente(0, "Luciane", "05/04/2004", "feminino", null, "Dipirona", "tipo OB");
		
		System.out.println("Nome: " +p1.nome);
		System.out.println("Data de nascimento: " +p1.datanascimento);
		System.out.println("sexo: " +p1.sexo);
		System.out.println("Alergia: " +p1.alergia);
		System.out.println("tipo sanguineo: " +p1.tiposanguineo);

		p1.nome = "lorivaldo Oliveira";
		p1.datanascimento= "01/10/1956";
		p1.sexo= "Masculino";
		p1.alergia= "Não possui";
		p1.tiposanguineo= "AB";
		
		System.out.println("Nome: " +p1.nome);
		System.out.println("Data de nascimento: " +p1.datanascimento);
		System.out.println("sexo: " +p1.sexo);
		System.out.println("Alergia: " +p1.alergia);
		System.out.println("tipo sanguineo: " +p1.tiposanguineo);
		
		
		
	}

}
