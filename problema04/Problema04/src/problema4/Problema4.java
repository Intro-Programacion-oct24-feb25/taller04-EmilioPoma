/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String nombre;
        double costoCpu;
        double costoTeclado;
        double costoRaton;
        double costoPantalla;
        
        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el costo de la CPU:");
        costoCpu = entrada.nextDouble();
        System.out.println("Ingrese el costo del raton:");
        costoTeclado = entrada.nextDouble();
        System.out.println("Ingrese el costo del raton:");
        costoRaton = entrada.nextDouble();
        System.out.println("Ingrese el costo de la pantalla:");
        costoPantalla = entrada.nextDouble();
        
        if ((costoCpu < 0 )||(costoTeclado < 0)||(costoRaton < 0)||
                (costoPantalla < 0)){
            System.out.println("Los valores ingresados no son validos.");
        }
        
        else
        {
            double costoTotal = (costoCpu + costoTeclado + costoRaton 
                    + costoPantalla);
            System.out.printf("\nReporte:\nNombre del cliente:%s\n"
                    + "Valores Iniciales:\nCPU:$%.2f\nTeclado:$%.2f\n"
                    + "Raton:$%.2f\nPantalla:$%.2f\n\n"
                    + "Valor a cancelar:$%.2f\n ", 
                    nombre, 
                    costoCpu,
                    costoTeclado,
                    costoRaton,
                    costoPantalla,
                    costoTotal);
        }
        
        
        
        
    }
    
}
