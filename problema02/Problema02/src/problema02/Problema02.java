/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        Double costoHijo1;
        Double costoHijo2;
        Double costoHijo3;
        
       System.out.println("Ingrese el costo de su primer hijo: ");
       costoHijo1 = entrada.nextDouble();
       System.out.println("Ingrese el costo de su segundo hijo: ");
       costoHijo2 = entrada.nextDouble();
       System.out.println("Ingrese el costo de su tercer hijo: ");
       costoHijo3 = entrada.nextDouble();
       
       if ((costoHijo1 < 0)||(costoHijo2 < 0)||(costoHijo3 < 0)){
        System.out.println("Error en ingreso de datos");
    }
       else
       {
           Double costosTotal = (costoHijo1 + costoHijo2 + costoHijo3);
           System.out.printf("Primer Hijo:\n%.2f\nSegundo Hijo:\n%.2f\n"
                   + "Tercer Hijo:\n%.2f\nTotal de Costos:\n%.2f\n",
           costoHijo1,
           costoHijo2,
           costoHijo3,
           costosTotal);
           
    }
       
    }
    
}
