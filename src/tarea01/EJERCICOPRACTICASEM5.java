/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea01;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LN6377-A0501
 */
public class EJERCICOPRACTICASEM5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector= new Scanner(System.in);
        System.out.println("ingresa cantidad de elemetos de los arreglos:");
        int n= lector.nextInt();
        int [] A = new int [n];
        int [] B=new int [n];
        int []C=new int [n];
        String menu="""
                    [1]SUMA
                    [2]IGUALDAD
                    [3]SALIR
                    INGRESA UNA OPCION:
                    """;
        
        
        for (int i=0;i<n;i++){
            A[i] = (int)(Math.random()*100+1);
            B[i] = (int)(Math.random()*100+1);
            //System.out.println(A[i]+" ");
        }
        System.out.println("");
        
        //for (int i=0;i<n;i++){
            //B[i] = (int)(Math.random()*100+1);
            //System.out.println(B[i]+" ");
        //}
        //System.out.println("");
        int op=0;
        do{
            System.out.println(menu);
            op=lector.nextInt();
            switch (op){
                case 1-> {
                    //int []C=new int [n];
                    for (int i=0;i<n;i++){
                        C[i]=A[i]+B[i];
                        System.out.printf("%d+%d=%d\n",A[i],B[i],C[i]);
                    }
                    
                    //System.out.println("Suma");
                }
                case 2->{
                    //int []C=new int [n];
                    for (int i=0;i<n;i++){
                        if (C[i]==A[i]){
                            
                        }
                    }
                    
                    System.out.println("Igualdad");
                }
                case 3->{
                    System.out.println("Adios");
            }
                    default -> System.out.println("Opcion incorrecta");
            }
        }while (op!=3);
        
    }
    
}
