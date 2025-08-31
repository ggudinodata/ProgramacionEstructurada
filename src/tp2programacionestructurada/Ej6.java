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
public class Ej6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pos = 0, neg = 0, ceros = 0, num;
    
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese el numero " + (i + 1));
            num = Integer.parseInt(input.nextLine());
            if (num > 0){
                pos += 1;
            }else if(num < 0) {
                neg += 1;
            }else{
                ceros += 1;
            }
        }
        System.out.println("Resultados:\nPositivos: " + pos + "\nNegativos: " + neg + "\nCeros: " + ceros);
    }
}
