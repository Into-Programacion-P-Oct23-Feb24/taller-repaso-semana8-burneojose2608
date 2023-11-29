/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int suma= 0;
        int n ;
        int m;
        System.out.println("ingrese un valor a n");
        n = entrada. nextInt();
        System.out.println("ingrese un valor a m");
        m = entrada .nextInt();
        do{
            n= n*2;
            m= m/2;
             if ( m % 2 ==1){         
             suma = suma + n ;
        }
    } while( m  >=1 );
       
        {
        System.out.printf("el resultado es %d\n", suma);
        
     }
    }
    
}
