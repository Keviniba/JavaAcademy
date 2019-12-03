import java.util.Scanner;
public class Subcadena{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame la cadena");
        String cadenaOriginal=scanner.nextLine();
        String subCadena="";
        if(cadenaOriginal.length() <2){
            System.out.println(cadenaOriginal);
        }else{
            subCadena = cadenaOriginal.substring(0,2);
            System.out.println(subCadena);
        }
    }
}