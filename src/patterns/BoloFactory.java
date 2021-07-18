package patterns;

public class BoloFactory {
	public static Bolo criarBolo(String nome) throws Exception{
		
		if(nome.equalsIgnoreCase("Classico")) {
			return new BoloClassico();
		}else if(nome.equalsIgnoreCase("Floresta negra")) {
			return new BoloFlorestaNegra();
		}else if(nome.equalsIgnoreCase("Rainha Branca")) {
			return new BoloRainhaBranca();
		}else {
			return null;
		}
		
	}
}
