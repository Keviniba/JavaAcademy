import java.util.Scanner;
public class notas{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int calificacion = 0;

        System.out.println("Ingresa la calificacion");
        calificacion=scanner.nextInt();

        if (calificacion <0){
            System.out.println("Ingresa un numero entre 1 10 por favor");
        }
        else if (calificacion >0 && calificacion<=4){
            System.out.println("suspenso");
        }
        else if (calificacion==5){
            System.out.println("aprobado");
        }
        else if (calificacion==6){
            System.out.println("bien");
        }
        else if (calificacion >=7 && calificacion <=8){
            System.out.println("notable");
        }
        else if (calificacion>=9 && calificacion<=10){
            System.out.println("sobresaliente");
        }
    }
}