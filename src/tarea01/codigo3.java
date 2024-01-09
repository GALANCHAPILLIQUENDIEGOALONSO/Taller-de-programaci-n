/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class codigo3 {
    public static void main(String[] args) {
        double montoTotal;
        double montoPagar;
        final double igv=0.18;
        double totalIGV;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingresar el monto total: ");
        montoTotal=entrada.nextDouble();
        
        montoPagar=montoTotal-montoTotal*igv;
        totalIGV= montoTotal*igv;
        
        System.out.println("El monto a pagar es: "+montoPagar+"   y el igv es: "+totalIGV);
    }
}
