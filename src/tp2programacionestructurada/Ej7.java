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
public class Ej7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        
        do {
            System.out.println("Ingrese una nota del 0 al 10: ");
            nota = Integer.parseInt(input.nextLine());
            if (nota > 10 || nota < 0) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota > 10 || nota < 0);
    }
}
