/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosevaluacion1;

/**
 *
 * @author JHONNY
 */
public class EjerciciosEvaluacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    SumaMultiplos suma = new SumaMultiplos();
    suma.multiplos();
    
    CuentaVocal vocal = new CuentaVocal();
    vocal.cuentaV();
    
    NumeroPrimo primo = new NumeroPrimo();
    boolean N1 = primo.NmeroP(4);
    System.out.println("Es numero primo "+ N1);
    
    }
    
}
