import java.util.Arrays;
import java.util.Scanner;

public class ModificarElementos {
    final static Scanner teclat = new Scanner(System.in);
    public static void main(String[] args) {
        String[] lista = {"Hola","Piña","Aceite","Cain"};
        String[] listaModificada = modificarElementos(lista);
        System.out.println(Arrays.toString(listaModificada));
    }
    public static String[] modificarElementos(String[] lista){
        System.out.print("Que palabra quieres cambiar? ");
        String palabraAModificar = teclat.next();
        System.out.print("Introduce la nueva palabra: ");
        String palabraModificada = teclat.next();
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(palabraAModificar)){
                lista[i] = palabraModificada;
            }
        }
        return lista;
    }

}