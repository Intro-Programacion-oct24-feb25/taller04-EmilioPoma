/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String nombre;
        Double valorNetflix;
        Double valorYoutube;
        Double valorDropbox;
        Double valorSpotify;
        
        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese cuanto paga mensualmente por Netflix:");
        valorNetflix = entrada.nextDouble();
        System.out.println("Ingrese cuanto paga mensualmente por Youtube Premium:");
        valorYoutube = entrada.nextDouble();
        System.out.println("Ingrese cuanto paga mensualmente por Dropbox:");
        valorDropbox = entrada.nextDouble();
        System.out.println("Ingrese cuanto paga mensualmente por Spotify:");
        valorSpotify = entrada.nextDouble();
        
        Double descuentoNetflix = (valorNetflix * 0.77);
        Double descuentoYoutube = (valorYoutube * 0.77);
        Double descuentoDropbox = (valorDropbox * 0.55);
        Double valorTotal = (descuentoNetflix + descuentoYoutube + descuentoDropbox + valorSpotify);
        
        System.out.printf ("\nReporte:\nUsuario: %s\n"
                + "Valor mensual de Netflix: $%.2f\n"
                + "Valor mensual de Youtube Premium: $%.2f\n"
                + "Valor mensual de Dropbox: $%.2f\n"
                + "Valor mensual de Spotify: $%.2f\n"
                + "Se aplica un descuento a los siguientes servicios:\n"
                + "Netflix(23%%): $%.2f\nYoutube Premium(23%%): $%.2f\n"
                + "Dropbox(45%%): $%.2f\n\nValor mensual total: $%.2f\n",
                nombre,
                valorNetflix,
                valorYoutube,
                valorDropbox,
                valorSpotify,
                descuentoNetflix,
                descuentoYoutube,
                descuentoDropbox,
                valorTotal);
    }
    
}
