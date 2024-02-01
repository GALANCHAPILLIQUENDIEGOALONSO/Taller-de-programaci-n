/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea01;

/**
 *
 * @author LAB-USR-LN6377-A0607
 */
public class EJERCICIO1SEMANA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        String menu="""
                    Menú de opciones:
                    [1] Progresion Aritmetica
                    [2] Progesion Geometrica
                    [3] Salir
                    
                    Elija una opcion: 
                    """;
        Scanner lector= new Scanner (System.in);     
        
        do {
            System.out.print(menu);
            opcion = lector.nextInt();
            
            if(opcion==1||opcion==2){
                
                double razon,cantidad;
                System.out.println("ingrese el valor de la razon: ");
                razon=lector.nextDouble();
                System.out.println("ingresa el numero de terminos: ");
                cantidad=lector.nextDouble();
                
                switch (opcion){
                    case 1->{
                        for (int i=1;i<=cantidad;i++){
                            
                            System.out.println(razon*i);
                        }
                    }
                    case 2->{
                        int num=1;
                        for (int i=1;i<=cantidad;i++){
                            num*=razon;
                            System.out.println(num*razon);
                        }
                    }
                }
            
            } else if (opcion!=3){
                System.out.println("Opcion no valida.");
            }
            
        } while (opcion!=3);
        System.out.println("FIN DEL PROGRAMA:)");
    }
    
}
