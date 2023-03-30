package com.edima.presentacion;

import java.util.Scanner;

public class ProbarScanner {
    public static void main(String[] args) {
        //ctrl+barra se carga el paquete del la clase, en este caso Scanner

//Declarar una variable primitiva
        int numero = 10;
        //Declarar un objeto Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero->");
        numero = sc.nextInt();
        System.out.println("El numero es: " + numero);

        //Evaluar un nombre, si el nombre es  "Juan" le damos la bienvenida, si no sólo damos la bienvenida.

        //Declarar un objeto Scanner

        System.out.println("Ingrese su nombre->");
        String nombre = sc.next();
        if (nombre.equalsIgnoreCase("Juan")) {
            System.out.println("Bienvenido " + nombre);
        }
        System.out.println("Numero 1");
        int num1 = sc.nextInt();
        System.out.println("Numero 2");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros son diferentes");
        }
        //Pedir dos numero y decir cual es mayor.
        System.out.println("Numero 3");
        int num3 = sc.nextInt();
        System.out.println("Numero 4");
        int num4 = sc.nextInt();
        if (num3 > num4) {
            System.out.println("El número 3 es mayor que el número 4");
        } else {
            System.out.println("El número 3 es menor que el número 4");
        }
        if (num3 == num4) {
            System.out.println("Los numeros son iguales");
        }

        //pedir dos numero oredenados de mayo a menor.
        System.out.println("Numero 5");
        int num5 = sc.nextInt();
        System.out.println("Numero 6");
        int num6 = sc.nextInt();
        if (num5 > num6) {
            System.out.println(num5 + ", " + num6);
        } else {
            System.out.println(num6 + ", " + num5);
        }
    }
}


