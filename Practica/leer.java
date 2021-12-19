import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

public class leer {
	String texto;
	BufferedReader contenido;
	ArrayList<String> lineas = new ArrayList<String>();
	 
	
	 public void leerLinea() 
	 {
		
			try {
				// Creamos un archivo FileReader que obtiene lo que tenga el archivo
				FileReader lector = new FileReader("texto.txt");
				// El contenido de lector se guarda en un BufferedReader
				contenido = new BufferedReader(lector);
	
				// Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y
				// lo mostramos
				} catch (Exception e) {
				//System.out.println("Error al leer mmmm");
				}
				while (true) {
					try {
						String linea = contenido.readLine();
						if (linea != null) {
							//System.out.println("l�nea no es igual a null y es: " + linea);
							
							this.lineas.add(linea);
						} else {
							break;
						}
					} catch (IOException e) {
						//System.out.println("el try fall�");
						e.printStackTrace();
						break;
					}
					// Si se causa un error al leer cae aqui
				}
	}
	public ArrayList<String> getLineas()
	
	{
		//System.out.print(lineas.get(3) );
		return lineas;
	}
}
