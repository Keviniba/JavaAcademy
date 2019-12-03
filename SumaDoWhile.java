package com.softtek.java.academy.challenge;
import java.util.Scanner;
public class SumaDoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
        int num1 = 0;
        int num2 = 0;
        int suma= 0;
        String decision;
        boolean seguir = false;
        do {
        	System.out.println("Dame el primer numero");
        	num1=scanner.nextInt();
        	System.out.println("Dame el segundo numero");
        	num2=scanner.nextInt();
        	suma=num1+num2;
        		System.out.println("La suma es: "+suma);     	
        		
        		System.out.println("Deseas seguir? y/n");
            	decision=scanner.next();
            	
            	switch(decision) {
            	case "y":
            		seguir=true;
            		break;
            	case "n":
            		seguir=false;
            		break;
            	}
        }
        while(seguir==true);}}

       
