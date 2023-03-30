package com.edima.presentacion;

public class Main {
    public static void main(String[] args) {

//Los articulos raton y teclado tienen el 10% de descuento
        String nombreArticulo = "raton";
        double descuento = 0.1, precio = 20;
        if(nombreArticulo.equals("raton") || nombreArticulo.equals("teclado")){
            System.out.println("El descuento es: "+descuento*precio);
        }else{
            System.out.println("NO tiene  descuento");
            // if(nombreArticulo.toLowerCase().equals("raton") || nombreArticulo.toLowerCase().equals("teclado")){
        }

    }
}