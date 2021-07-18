package patterns;

public class MainTest {

	public static void main(String[] args){
		try{
			Bolo bolo = BoloFactory.criarBolo("classico");
			System.out.println(bolo.getDescri��o() +"\n");
		} catch (Exception e) {
			System.out.println("Opera��o invalida");
			e.printStackTrace();
		}
		
		try{
			Bolo b1 = BoloFactory.criarBolo("Floresta negra");
			System.out.println(b1.getDescri��o() +"\n");
		} catch (Exception e) {
			System.out.println("Opera��o invalida");
			e.printStackTrace();
		}
		
		
		 // Op��o de bolo que n�o existe
		 try{
			Bolo b2 = BoloFactory.criarBolo("Relvet velvet");
			System.out.println(b2.getDescri��o() +"\n");
		} catch (Exception e) {
			System.out.println("Opera��o invalida");
			e.printStackTrace();
		}
	
	}

}
