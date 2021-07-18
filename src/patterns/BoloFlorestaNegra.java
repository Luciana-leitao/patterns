package patterns;

public class BoloFlorestaNegra implements Bolo {
	private String cobertura = "Chocolate branco";
	private String massa = "Chocolate";
	private String recheio = "Creme de cereja";
	
	
	@Override
	public String getDescrição() {
		return "**** Bolo Floresta Negra ******" +
				"\n Cobertura de:" + this.cobertura +
				"\n Massa de: " + this.massa +
				"\n Recheio de: " + this.recheio;
	}
}
