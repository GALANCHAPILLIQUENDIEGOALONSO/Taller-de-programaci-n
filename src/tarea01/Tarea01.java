/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Tarea01 {

    public static void main(String[] args) {
        double area;
        double base;
        double altura;
        
        System.out.println("Ingresar datos del triangulo... ");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresar distancia de la base: ");
        base=entrada.nextDouble();
        System.out.println("Ingresar distancia de la altura: ");
        altura=entrada.nextDouble();
        
        area=base*altura/2;
        
        System.out.println("El area del triangulo es: "+area);
    }
    
}
