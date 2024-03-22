/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosevaluacion1;

/**
 *
 * @author JHONNY
 */
public class NumeroPrimo {
    
    public boolean NmeroP(int numero){
        if (numero <= 1) 
            return false;
        for (int i = 2; i <=  Math.sqrt(numero); i++){
            if ( numero % i == 0 )
            return false;
        }
        return true;
    }
        
    
}
