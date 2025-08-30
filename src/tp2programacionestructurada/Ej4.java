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
public class Ej4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
        char categoria;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());        
        
        System.out.println("Ingrese la categoria del producto: ");
        categoria = input.nextLine().charAt(0);        
        
        switch (categoria){
            case 'A':
            case 'a':
                System.out.println("Descuento aplicado: 10%\nPrecio final: " + precio * 0.9);
                break;
            case 'B':
            case 'b':
                System.out.println("Descuento aplicado: 15%\nPrecio final: " + precio * 0.85);
                break;
            case 'C':
            case 'c':
                System.out.println("Descuento aplicado: 20%\nPrecio final: " + precio * 0.8);
                break;
        }
    }
}
