package CLINICAMEDICA;

public class prncipal1 {

	public static void main(String[] args) {
		
		endereço E1 = new endereço("joaquim Silva Dantas", 123, "apartamento", "nova america", "Euclides da cunha", "BA", 0);
		
		medico m1 = new medico (56, "Marcos vinicius", "masculino", "Fisioterapia", "joaquim silva dantas");
		
		System.out.println ("Endereço :");
		System.out.println("Rua: " +E1.rua);
		System.out.println("numero:  " +E1.numero);
		System.out.println("complemento: " +E1.complemento);
		System.out.println("Bairro: " +E1.bairro);
		System.out.println("Cidade: " +E1.cidade);
		System.out.println("UF: " +E1.uf);
		
		
		System.out.println ("Médico :");
		System.out.println("codigo: " +m1.codigo);
		System.out.println("nome:  " +m1.nome);
		System.out.println("sexo: " +m1.sexo);
		System.out.println("especialidade: " +m1.especialidade);
		System.out.println("Endereço: " +m1.endereço);
		
		
		E1.rua = "Maria quitéria";
		E1.numero = 450;
		E1.complemento = "casa amarela";
		E1.bairro = "lagoa do quede";
		E1.cidade = "Feira de Santana";
		E1.uf = "BA";
		
		m1.codigo = 12;
		m1.nome = "luiza Melo";
		m1.sexo = "feminino";
		m1.especialidade = "fonodióloga";
		m1.endereço = "Maria Quitéria";
		
		

			System.out.println ("Endereço :");
			System.out.println("Rua: " +E1.rua);
			System.out.println("numero:  " +E1.numero);
			System.out.println("complemento: " +E1.complemento);
			System.out.println("Bairro: " +E1.bairro);
			System.out.println("Cidade: " +E1.cidade);
			System.out.println("UF: " +E1.uf);

			
			System.out.println ("Médico :");
			System.out.println("codigo: " +m1.codigo);
			System.out.println("nome:  " +m1.nome);
			System.out.println("sexo: " +m1.sexo);
			System.out.println("especialidade: " +m1.especialidade);
			System.out.println("Endereço: " +m1.endereço);
					

	}

}
