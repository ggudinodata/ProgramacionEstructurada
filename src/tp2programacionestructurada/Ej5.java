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
public class Ej5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1, cont = 0;
                        
        while (num != 0){
            System.out.println("Ingrese un numero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            if (num % 2 == 0){
                cont += num;
            }
        }
        
        System.out.println("La suma de los numeros pares es: " + (cont));
    }
}
