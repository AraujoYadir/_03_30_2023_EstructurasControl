package com.edima.presentacion;
import java.util.Scanner;

public class ProbarSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Estado Civil:");
        String estadoCivil = teclado.next();
        switch (estadoCivil) {
            case "S":
                System.out.println("Soltero");
            break;
            case "V":
                System.out.println("Viudo");
            break;
            case "D":
                System.out.println("Divorciado");
            break;
            case "C":
                System.out.println("Casado");
            break;
            default: System.out.println("Estado no valido");
            break;
        }

        // Pedir una nota de 0 a 10 y mostrarla de la forma: Suficiente, Insuficiente, Muy bien

        System.out.println("Ingrese una nota");
        int nota = teclado.nextInt();
        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("Insuciente");
                break;
            case 7,8:
                System.out.println("bien");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            case 5,6:
                System.out.println("Suficiente");
                break;

            default:
                System.out.println("Estado no valido");
                break;




        }
    }
}





