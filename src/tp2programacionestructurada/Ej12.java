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
public class Ej12 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
        
        System.out.println("Precios originales: ");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: " + precios[i]);            
        }
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: " + precios[i]);
        }
    }
}
