import java.util.Scanner;

public class TreballEntorns {
    public static void main(String[] args) {
        Scanner entradaDades = new Scanner(System.in);
        String[] menu = new String[20];

        int posicioArray = 0;
        boolean eixir;
        do {
            System.out.print("Escriu el que vols afegir al menú: ");
            String nouElement = entradaDades.nextLine();
            eixir = nouElement.equalsIgnoreCase("q");
            if (eixir){
                return;
            }
            menu[posicioArray] = nouElement;
            posicioArray++;
        }while(posicioArray != menu.length);


    }

    public static void imprimirMenuActual(String[] arrayATractar){
        for (int i = 0; i < arrayATractar.length; i++) {
            if (arrayATractar[i] == null){
                break;
            }
            System.out.println("-> " + arrayATractar[i] );
        }
    }
}
