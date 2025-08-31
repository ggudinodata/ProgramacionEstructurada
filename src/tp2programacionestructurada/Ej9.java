/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2programacionestructurada;

import java.util.Scanner;
/**
 *
 * @author gmgud_ita4nrw
 */
public class Ej9 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, precio, precioTotal, costoEnvio;
        String zona;
    
        System.out.println("Ingrese el peso del producto: ");
        peso = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        precioTotal = calcularTotalCompra(precio, costoEnvio);
        
        System.out.println("El costo del envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + precioTotal);
    }
    static double calcularCostoEnvio(double peso, String zona){
        double valorZona = 0;
        switch (zona){
            case "nacional":
            case "Nacional":
                valorZona = 5;
                break;
            case "internacional":
            case "Internacional":
                valorZona = 10;
                break;
        }
        return valorZona * peso;
    }
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
}
