import java.util.Scanner;

public class ListarElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String array [] = new String [20];

    listarElementos(array);
    char eixir = scanner.next().charAt(0);
        if (eixir == 'q'){
            return;
        }
    }
    public static void listarElementos(String arr[]){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != null)
            System.out.println(arr[i]);
        }
    }
}
