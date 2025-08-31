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
public class Ej10 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida;
        
        System.out.println("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantidadVendida, cantidadRecibida));
        
    }
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock;
        
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
}
