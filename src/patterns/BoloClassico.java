package patterns;

public class BoloClassico implements Bolo {
	private String cobertura = "Chocolate";
	private String massa = "P�o-de-l�";
	private String recheio = "Brigadeiro";
	
	
	@Override
	public String getDescri��o() {
		return "**** Bolo Classico ******" +
				"\n Cobertura de:" + this.cobertura +
				"\n Massa de: " + this.massa +
				"\n Recheio de: " + this.recheio;
	}
	
	
	
	
	
}
