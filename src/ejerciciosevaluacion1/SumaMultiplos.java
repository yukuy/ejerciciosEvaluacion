/*0
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosevaluacion1;

/**
 *
 * @author JHONNY
 */
public class SumaMultiplos {
    
    int sumaTotal = 0; 
    int suma3 = 0;
    int suma4 = 0;
    int suma5 = 0;
    
    public void multiplos(){
                  
        for (int i = 1; i <= 1000; i+=3){
            suma3 += i;
        }
              
        for (int i = 1; i <= 1000; i+=4){
            suma4 += i;
        }
        
        for (int i = 1; i <= 1000; i+=5){
            suma5 += i;
        }
       
        sumaTotal = suma3 + suma4 + suma5 ;
        
        System.out.println("la  suma de los multiplos de 3 del 1 al 1000 es: "+ suma3);
        System.out.println("La suma de los multiplos de 4 del 1 al 1000 es: "+ suma4);
        System.out.println("la suma se los multiplos de 5 del 1 al 1000 es; "+ suma5);
        System.out.println("la suma total de los multiplos de 3, 4, 5 es: "+ sumaTotal);
    }
}
