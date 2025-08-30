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
public class Ej2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(input.nextLine());
        
        
        if (num1 >= num2 && num1 >= num3){
            System.out.println("El numero " + num1 + " es el mayor.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El numero " + num2 + " es el mayor.");
        } else {
            System.out.println("El numero " + num3 + " es el mayor.");
        }
    }
    
}
