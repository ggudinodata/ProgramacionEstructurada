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
public class Ej11 {
    final static double DESCUENTO_ESPECIAL = 0.10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio, descuento;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        descuento = calcularDescuentoEspecial(precio);
        
        System.out.println("El descuento especial aplicado es: " + descuento);
        System.out.println("El precio final con descuento es: " + (precio - descuento));
    }
    static double calcularDescuentoEspecial(double precio){
        return precio * DESCUENTO_ESPECIAL;
    }
}
