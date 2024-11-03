/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombresCompletos;
        String direccion;
        Double costoMinutos;
        Double numeroMinutos;
        
        System.out.println("Ingrese sus nombres completos");
        nombresCompletos = entrada.nextLine();
        System.out.println("Ingrese su direccion");
        direccion = entrada.nextLine();
        System.out.println("Ingrese el costo por minuto de Telefono:");
        costoMinutos = entrada.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos:");
        numeroMinutos = entrada.nextDouble();
        
        if ((costoMinutos < 0)||(numeroMinutos<0)){
            System.out.println("Los datos ingresados no son validos");
        }
        else 
        {
            Double valorFinal = (numeroMinutos * costoMinutos);
            System.out.printf("Reporte:\nNombres Completos: %s\n\t"
                    + "Direccion: %s\nCosto por minuto: $%.2f\n\t"
                    + "Numero de minutos consumidos: %.2f\n\t\tvalorFinal: $%.2f\n",
            nombresCompletos,
            direccion,
            costoMinutos,
            numeroMinutos,
            valorFinal);
        }
        
        
    }
    
}
