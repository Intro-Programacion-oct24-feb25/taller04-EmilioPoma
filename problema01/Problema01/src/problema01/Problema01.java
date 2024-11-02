/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        Double baseTriangulo;
        Double alturaTriangulo;
        
        System.out.println("Ingrese la base del triangulo: ");
       baseTriangulo = entrada.nextDouble();
       System.out.println("Ingrese la altura del triangulo: ");
       alturaTriangulo = entrada.nextDouble();
       
       
       if ((baseTriangulo < 0) || (alturaTriangulo < 0)){
           System.out.println("Error en ingreso de datos");
       } 
       else           
       {
            Double area = ((baseTriangulo * alturaTriangulo)/2);
            System.out.printf("Base:\n%.2f\nAltura:\n%.2f\nEl area del triangulo es de: \n%.2f\n8", 
                    baseTriangulo, 
                    alturaTriangulo, 
                    area);
       }
    }
    
}

