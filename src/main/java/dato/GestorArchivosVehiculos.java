package dato;
import java.io.*;
import modelo.Vehiculo;




public class GestorArchivosVehiculos{

    //Métod que crea el archivo de texto
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente");
        }catch(IOException e){
            e.printStackTrace();
        }
    }


}
