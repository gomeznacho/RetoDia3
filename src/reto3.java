import java.io.*;
import java.util.Scanner;

public class reto3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu nombre completo:");
        String nombreCompleto = sc.nextLine();

        String[] nombreSeparado = separarNombres(nombreCompleto);

        if (nombreSeparado.length == 1){
            String nombre = nombreSeparado[0];
            System.out.println("nombre: " + nombre);
        }
        else if(nombreSeparado.length == 2){
            if(esNombre(nombreSeparado[1])){
                String nombre = nombreSeparado[0];
                String nmbre2 = nombreSeparado[1];
                System.out.println("nombre: " + nombre + ", segundo nombre: " + nmbre2);
            }
            else{
                String nombre = nombreSeparado[0];
                String apellido = nombreSeparado[1];
                System.out.println("nombre: " + nombre + ", apellido: " + apellido);
            }
        }
        else if(nombreSeparado.length == 3){
            if(esNombre(nombreSeparado[1])){
                String nombre = nombreSeparado[0];
                String nmbre2 = nombreSeparado[1];
                String apellido = nombreSeparado[2];
                System.out.println("nombre: " + nombre + ", segundo nombre: " + nmbre2 + ", apellido: " + apellido);
            }
            else{
                String nombre = nombreSeparado[0];
                String apellido1 = nombreSeparado[1];
                String apellido2 = nombreSeparado[2];
                System.out.println("nombre: " + nombre + ", primer apellido: " + apellido1 + ", segundo apellido: " + apellido2);

            }
        }
        else if (nombreSeparado.length == 4){
            if(esNombre(nombreSeparado[1])){
                String nombre = nombreSeparado[0];
                String nmbre2 = nombreSeparado[1];
                String apellido1 = nombreSeparado[2];
                String apellido2 = nombreSeparado[3];
                System.out.println("nombre: " + nombre + ", segundo nombre: " + nmbre2 + ", apellido: " + apellido1 + ", segundo apellido: " + apellido2);
            }
        }
    }

    public static String[] separarNombres (String n){

        String[] nombreSep = n.split(" ");
        return nombreSep;
    }

    public static boolean esNombre (String s) {

        File listado = new File("C:\\Users\\Jinbo Jonez\\Desktop\\txtProgam\\lista de nombres.txt");
        boolean nombre = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(listado));
            String namae;
            while((namae =reader.readLine()) != null){
                if (namae.equalsIgnoreCase(s)){
                    nombre = true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return nombre;
    }
}
