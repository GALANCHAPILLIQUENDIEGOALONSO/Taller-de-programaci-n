/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea01;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LN6377-A0607
 */
public class ejerciciopractica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n; 
        int firstTerm=0,secondTerm=1;
        System.out.println("Ingresar la cantidad de numeros de la serie: ");
        Scanner lector = new Scanner (System.in);
        n=lector.nextInt();
        for (int i=0; i<n;i++){
            System.out.println(firstTerm+",");
            
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
    
}
