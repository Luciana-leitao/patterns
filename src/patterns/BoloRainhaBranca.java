package patterns;

public class BoloRainhaBranca implements Bolo {
	private String cobertura = "Chocolate Branco";
	private String massa = "Amanteigada";
	private String recheio = "Beijinho";
	
	
	@Override
	public String getDescrição() {
		return "**** Bolo Rainha Branca ******" +
				"\n Cobertura:" + this.cobertura +
				"\n Massa de: " + this.massa +
				"\n Recheio de: " + this.recheio;
	}
}
