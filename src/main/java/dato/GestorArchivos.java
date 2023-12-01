package dato;
import java.io.*;
import modelo.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;


public class GestorArchivos {

    //Método que crea el archivo de texto
    public static void crearArchivo(String direccionArchivo) {
        File archivo = new File(direccionArchivo);
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo.");
        }
    }

    //Método que verifica si existe el archivo
    public static boolean existeArchivo(String direccionArchivo) {
        File archivo = new File(direccionArchivo);
        return archivo.exists();
    }

    //Método que lee Archivo de texto verificando su existencia con el metodo existeArchivo
    public static void leerArchivo(Clase clase, String direccionArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(direccionArchivo))) {
            String textoArchivo;
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                clase.agregar(new Estudiante(data[0], data[1], data[2]));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }

    //Método que carga los datos en el archivo de texto



    //Método que guarda los datos en el archivo de texto, verificando su existencia con el metodo existeArchivo
    public static boolean guardarDatos(Clase clase, String direccionArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(direccionArchivo, true))) {
            // Si el documento no es nuevo y tiene datos registrados, añadir una nueva línea
            if (new File(direccionArchivo).exists()) {
                bw.newLine();
            }
            bw.write(clase.toString());
            return true;
        } catch (IOException e) {
            System.out.println("Error al ingresar estudiante, favor contactar con administrador");
            return false;
        }
    }


    //Método que elimina un dato del archivo de texto

    public static boolean eliminarDato(Clase clase, String direccionArchivo){
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            ArrayList<String> lineas = new ArrayList<>();
            while((linea = br.readLine()) != null){
                lineas.add(linea);
            }
            br.close();
            fr.close();
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String l : lineas){
                if(!l.equals(clase.toString())){
                    bw.write(l);
                    bw.newLine();
                }
            }
            bw.close();
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error al eliminar estudiante, favor contactar con administrador");
            return false;
        }
    }

    //Método que elimina un archivo de texto, verificando su existencia con el metodo existeArchivo
    public static boolean eliminarArchivo(String direccionArchivo) {
        File archivo = new File(direccionArchivo);
        if (archivo.delete()) {
            System.out.println("Archivo eliminado: " + archivo.getName());
            return true;
        } else {
            System.out.println("No se pudo eliminar el archivo.");
            return false;
        }
    }
}

