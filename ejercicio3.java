	import java.util.Scanner;
public class ejercicio3 {

	    public static void main(String[] ar) {
	    	 Scanner teclado=new Scanner(System.in);
	    	int numero;
	    	System.out.print("Ingrese el numero:");
	    	numero=teclado.nextInt();
	    	if (numero%2 ==0) {
	    	    System.out.println("el numero es par");
	        }
	        else{
	            System.out.println("el numero es impar");
	        }
	    }
	}