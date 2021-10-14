package SUAP;

public class Aluno {

	String nome;
	String CPF;
	double nota1;
	double nota2;
	double nota3;
	
	
	public Aluno(String nome, String CPF) {
		nome = nome;
		CPF = CPF;
	}



	public double Calcularmedia () {
		double resultado = (nota1+nota2+nota3)/3; 
		return resultado ;
	}
}
