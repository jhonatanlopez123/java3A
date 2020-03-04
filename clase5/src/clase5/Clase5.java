/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0,b=0,c=0,d=0,g=0;
        while(g == 0){    
        Scanner l = new Scanner(System.in);
        System.out.println("numero tabla multiplicar: ");
        a = l.nextInt();
        System.out.println("rango de impresion (inicio): ");
        b = l.nextInt();
        System.out.println("rango de impresion (fin): ");
        c = l.nextInt();
        if(b>c){
         System.out.println("ERROR");
         System.out.println("***************************");
         System.out.println("---------------------------");
         g = 0;
        }else{
         System.out.println("tabla: ");
         for(b=b;b<=c;b++){
         d = a * b;
         System.out.println(a+" * "+b+" = "+d);
         g = 1;
        }
        }
        
        
    }
    } 
}
