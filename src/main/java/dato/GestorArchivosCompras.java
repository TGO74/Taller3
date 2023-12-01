package dato;

import java.io.*;
import modelo.Vehiculo;


public class GestorArchivosCompras {

	//mTOO QUE CREAR ARchivo de compras
	public static void crearArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("El archivo se ha creado correctamente");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Método que guarda los datos en el archivo de texto

	public static void guardarDatos(Vehiculo vehiculo, String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(vehiculo.toString());
			salida.close();
			System.out.println("Se ha guardado correctamente");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Método que lee los datos del archivo de texto

	public static void leerArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = entrada.readLine();
			while (lectura != null) {
				System.out.println(lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Metodo que eliminar un vehiculo del archivo de texto

	public static void eliminarVehiculo(String nombreArchivo, String patente) {
		File archivo = new File(nombreArchivo);
		File archivoNuevo = new File("temp.txt");
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			PrintWriter salida = new PrintWriter(new FileWriter(archivoNuevo));
			String lectura = entrada.readLine();
			while (lectura != null) {
				String[] data = lectura.split(",");
				if (!data[0].equalsIgnoreCase(patente)) {
					salida.println(lectura);
				}
				lectura = entrada.readLine();
			}
			entrada.close();
			salida.close();
			archivo.delete();
			archivoNuevo.renameTo(archivo);
			System.out.println("Se ha eliminado correctamente");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}