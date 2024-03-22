/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosevaluacion1;

import java.util.Scanner;

/**
 *
 * @author JHONNY
 */
public class CuentaVocal {
    
    String texto = "";
    int contadorA, contadorE, contadorI,contadorO, contadorU;
   
    
    public void cuentaV(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String texto = scanner.next().toLowerCase();
        scanner.close();
        
        for(int i = 0; i < texto.length(); i++){
            char caracter = texto.charAt(i);
            switch (caracter){
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
                default:
                    // Ignorar caracteres que no son vocales
                    break;
       
            }          
        }
        
        int totalV = contadorA + contadorE + contadorI + contadorO + contadorU;
        
        System.out.println("Total de la vocal A es: "+ contadorA);
        System.out.println("Total de la vocal E es: "+ contadorE);
        System.out.println("Total de la vocal I es: "+ contadorI);
        System.out.println("Total de la vocal O es: "+ contadorO);
        System.out.println("Total de la vocal U es: "+ contadorU);
        System.out.println("La cantidad total de vocales es: "+ totalV);
        
    }
    
}
