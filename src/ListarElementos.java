public class ListarElementos {
    public static void main(String[] args) {
    String array [] = new String [20];
    array[1] = "si";
    array[2] = "buenass";
    listarElementos(array);
    }
    public static void listarElementos(String arr[]){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != null)
            System.out.println(arr[i]);
        }
    }
}
