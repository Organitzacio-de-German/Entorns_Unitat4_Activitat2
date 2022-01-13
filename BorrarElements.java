import java.util.Scanner;

public class BorrarElements {
    public static void main(String[] args) {
        Scanner entradaDades = new Scanner(System.in);
        String[] menu = new String[20];
        int posicioArray = 0;
        boolean eixir;
        do {
            System.out.print("Escriu el que vols eliminar del menú: ");
            String borrar = entradaDades.nextLine();
            eixir = borrar.equalsIgnoreCase("q");
            if (eixir){
                return;
            }
            int elementBorrat = Integer.parseInt(borrar);
            menu[elementBorrat + 1] = null;
            posicioArray++;
        }while(posicioArray != menu.length);
    }
}
