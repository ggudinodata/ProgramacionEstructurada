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
public class Ej8 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase, impuesto, descuento;
    
        System.out.println("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el impuesto en porcentaje (ej: 10 para 10%): ");
        impuesto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el descuento en porcentaje (ej: 5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine());
        
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(precioBase, impuesto, descuento));
    }
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal;
        
        precioFinal = precioBase + (precioBase * (impuesto/100)) - (precioBase * (descuento/100));
        return precioFinal;
    }
}
