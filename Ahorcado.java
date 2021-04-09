package com.company;

import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
    	Integer a;
        Integer b;
        Integer c;
        Integer d;
        Integer opcion;
        Integer resultado = null;
        Scanner teclado = new Scanner(System.in);
        do{
        	System.out.println("************************");
			System.out.println("Menu de opciones\n");
			System.out.println("1 - Restar");
			System.out.println("2 - Sumar ");
			System.out.println("3 - Dividir");
			System.out.println("4 - Multiplicar");
			System.out.println("9 - Salir");
			System.out.println("************************");
            opcion = teclado.nextInt();
           
            switch(opcion) {
            case 1:
            	System.out.println("Ingrese el primer numero");
                a = teclado.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = teclado.nextInt();
            restar(a, b);
            break;
            case 2:	
            	System.out.println("Ingrese el primer numero");
                a = teclado.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = teclado.nextInt();
            sumar(a, b);
            	break;
            case 3:
            	System.out.println("Ingrese el primer numero");
                a = teclado.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = teclado.nextInt();
            dividir(a, b);
            	break;
            case 4:
            	System.out.println("Ingrese el primer numero");
                a = teclado.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = teclado.nextInt();
            multiplicar(a, b);
            	break;
            case 9:
            	System.out.println("Hasta la proxima!!");
            break;
            default:
            	System.out.println("Ingresa una opcion correcta");
                    }
        }while(opcion != 9);
        
    
	}
	
	public static void restar(int a, int b) {
	int resultado = 0;
	resultado = a - b;
	System.out.println("El resultado es " + resultado);
	}
	public static void sumar(int a, int b) {
		int resultado = 0;
		resultado = a + b;
	System.out.println("El resultado es " + resultado);
	}
	public static void dividir(int a, int b) {
		int resultado = 0;
		resultado = a / b;
	System.out.println("El resultado es " + resultado);
	}
	public static void multiplicar(int a, int b) {
		int resultado = 0;
		resultado = a * b;
	System.out.println("El resultado es " + resultado);
	}

}

