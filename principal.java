package Facebook;

public class principal {

	public static void main(String[] args) {
		post Post = new post ("Na vida o plantio � opcional, por�m, a colheita � obrigat�ria. "
				+ "Por isso tome cuidado com o que voc� planta porque o que voc� plantar, "
				+ "voc� vai colher.", "https://driveandlisten.herokuapp.com/");
		
		
	Post.curtir(3);
	
	System.out.println ("o n�mero de curtidas s�o " +Post.numerocurtidas);
	
	Post.compartilhar(2);
	System.out.println ("o n�mero de compartilhamento s�o " +Post.numerocompartilhamentos);
	
		
		
		

	}


	
}
