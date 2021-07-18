package patterns;

public class BoloClassico implements Bolo {
	private String cobertura = "Chocolate";
	private String massa = "Pão-de-ló";
	private String recheio = "Brigadeiro";
	
	
	@Override
	public String getDescrição() {
		return "**** Bolo Classico ******" +
				"\n Cobertura de:" + this.cobertura +
				"\n Massa de: " + this.massa +
				"\n Recheio de: " + this.recheio;
	}
	
	
	
	
	
}
