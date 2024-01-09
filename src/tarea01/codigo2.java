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
public class codigo2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x1;
        double x2;
        
        System.out.println("Desarrollar la ecuacion con la forma A(x)^2+Bx+c=0");
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Ingresar 'A'");
        a=entrada.nextDouble();
        
        System.out.println("Ingresar 'B'");
        b=entrada.nextDouble();
        
        System.out.println("Ingresar 'C'");
        c=entrada.nextDouble();
        
        double m=Math.sqrt((b*b)-(4*a*c));
     
        x1=(-b-m)/(2*a);
        x2=(-b+m)/(2*a);
        
        System.out.println("X toma los siguientes valores: \n"+x1);
        System.out.println("y" + x2);
    }
}
