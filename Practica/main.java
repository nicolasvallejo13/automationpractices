
public class main {

	public static void main(final String[] args) {
		
		System.out.print("hola");
		
		persona yo = new persona(23 , "nico");
		System.out.print( yo.getEdad() + "  " + yo.getNombre());
		
		app nuevaApp = new app(); 
		nuevaApp.startApp();
		
	}
	
	

}
