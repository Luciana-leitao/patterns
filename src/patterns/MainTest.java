package patterns;

public class MainTest {

	public static void main(String[] args){
		try{
			Bolo bolo = BoloFactory.criarBolo("classico");
			System.out.println(bolo.getDescrição() +"\n");
		} catch (Exception e) {
			System.out.println("Operação invalida");
			e.printStackTrace();
		}
		
		try{
			Bolo b1 = BoloFactory.criarBolo("Floresta negra");
			System.out.println(b1.getDescrição() +"\n");
		} catch (Exception e) {
			System.out.println("Operação invalida");
			e.printStackTrace();
		}
		
		
		 // Opção de bolo que não existe
		 try{
			Bolo b2 = BoloFactory.criarBolo("Relvet velvet");
			System.out.println(b2.getDescrição() +"\n");
		} catch (Exception e) {
			System.out.println("Operação invalida");
			e.printStackTrace();
		}
	
	}

}
