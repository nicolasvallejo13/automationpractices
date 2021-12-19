import java.io.File;
import java.io.FileWriter;
public class escribir {
	
	public escribir ( String nombre, String tipo, String ejemplo, String traducci�n, int vocabScore) {
	try
	{
	//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
	File archivo=new File("texto.txt");

	//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
	FileWriter escribir=new FileWriter(archivo,true);

	//Escribimos en el archivo con el metodo write
	escribir.write(vocabScore +"$$" + nombre +"$$" + tipo +"$$" + ejemplo+ "$$" + traducci�n + "\n");
	System.out.println(" deber�a haberse guardado " + nombre +" " + tipo +" " + ejemplo+ " " + traducci�n );

	//Cerramos la conexion
	escribir.close();
	}

	//Si existe un problema al escribir cae aqui
	catch(Exception e)
	{
	System.out.println("Error al escribir");
	}
	}
}
