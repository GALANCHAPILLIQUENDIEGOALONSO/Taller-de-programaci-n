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
public class ejerciciopractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String tipoEmpleado = "";
        double salarioMensual = 0.0;
        int boletasEmitidas = 0;
        int mesEnCurso = 0;
        
        String imprimir1="""
                    ###############################################
                     RESUMEN DE BOLETAS DE PAGO
                    #####################＃#########＃#############
                     Empleado: %S
                     Tipo: %S
                    ###############################################
                         Datos del Salario              BoLeta
                         """;

        String imprimir2="""
                    ###############################################
                     Boletas emitidas: %d Boletas Restante: %d
                    ###############################################
                    """;
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Ingresar nombre y tipo de empleado");
            System.out.println("2. Ingresar salario mensual, boletas emitidas y mes en curso");
            System.out.println("3. Elaborar reporte ASCII");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");



            int opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer de entrada



                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del empleado: ");
                        nombre = sc.nextLine();
                        System.out.print("Ingrese el tipo de empleado (contratado o nombrado): ");
                        tipoEmpleado = sc.nextLine();
                    break;
                    
                    case 2:
                        System.out.print("Ingrese el salario mensual: ");
                        salarioMensual = sc.nextDouble();
                        System.out.print("Ingrese el número de boletas emitidas: ");
                        boletasEmitidas = sc.nextInt();
                        System.out.print("Ingrese el número de mes en curso: ");
                        mesEnCurso = sc.nextInt();
                    break;
                    
                    case 3:
                        if (nombre.isEmpty() || tipoEmpleado.isEmpty() || salarioMensual == 0.0
                        || boletasEmitidas == 0 || mesEnCurso == 0) {
                        System.out.println("Por favor, ingrese todos los datos antes de generar el reporte.");
                        } else {
                            System.out.printf(imprimir1,nombre,tipoEmpleado);
                            for (int i=1;i<=mesEnCurso;i++){
                                System.out.println("Mes "+i+": "+salarioMensual);
                            }
                            System.out.printf(imprimir2,boletasEmitidas,30-boletasEmitidas);
                        }
                    break;
                    
                    case 4:
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                    break;
                    default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
                }

    }
    
}
