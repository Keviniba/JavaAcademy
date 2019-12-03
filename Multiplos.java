package com.softtek.java.academy.challenge;

public class Multiplos {
	    public static void main(String[] args) {
	        int maximo = 100;
	        int suma = 0;
	        for(int i = 1; i < maximo; i++) {
	            if(i%3 == 0) {
	                suma += i;
	            }
	            if (i%5 == 0)
	            	suma += i;
	        }
	        System.out.println(suma);
	    }
	}

