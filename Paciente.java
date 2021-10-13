package CLINICAMEDICA;

public class Paciente {
   //Atributos://

	 int codigo;
     String nome;
	 String datanascimento;
     String sexo;
	String planoSaude;
	String alergia;
	String tiposanguineo;

 public Paciente (int codigo, String nome, String datanascimento, String sexo, String planoSaude, String alergia,String tiposanguineo) {
		this.codigo = codigo;
		this.nome = nome;
		this.datanascimento = datanascimento;
		this.sexo = sexo;
		this.planoSaude = planoSaude;
		this.alergia = alergia;
		this.tiposanguineo = tiposanguineo;
	}
}
