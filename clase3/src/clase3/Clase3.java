/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Aula1
 */
public class Clase3 {
    public static void main(String[] args) {
       /*Scanner l = new Scanner(System.in);
       int a = 0 , b = 0 , s = 0 , r = 0, m = 0; 
       float d = 0;
       System.out.println ("primer numero: ");
       a = l.nextInt();
       System.out.println ("segundo numero: ");
       b = l.nextInt();
       s = a + b;
       r = a - b;
       m = a * b;
       d = a / b;
       System.out.println ("1. suma: "+s);
       System.out.println ("2. resta: "+r);
       System.out.println ("3. multiplicacion: "+m);
       System.out.println ("4. divicion: "+d);
       
       if (a > b){
           System.out.println ("el mayor es: "+ a);
        }else{
          if(a < b){
              System.out.println ("el mayor es: "+ b);
          }else{
              System.out.println ("son iguales");
          }
        }
    }
    
}*/
       Scanner l = new Scanner(System.in);
       int a = 0 , n = 0 , n1 = 0 , s = 0 , r = 0 , m = 0; 
       double d = 0;
       System.out.println ("1. suma ");
       System.out.println ("2. resta ");
       System.out.println ("3. multiplicacion ");
       System.out.println ("4. divicion ");
       System.out.println ("su opcion: ");
       a = l.nextInt();
       System.out.println ("primer numero: ");
       n = l.nextInt();
       System.out.println ("segundo numero: ");
       n1 = l.nextInt();
       s = n + n1;
       r = n - n1;
       m = n * n1;
       String d = n / n1;
    if (a == 1){
       System.out.println ("la suma es: "+ s);
    }else{
       if (a == 2){
           System.out.println ("la resta es: "+ r);
        }else{
           if (a == 3){
               System.out.println ("la mul es: "+ m);
            }else{
               if (a == 4){
               System.out.printf("%.3f %n", d);
            }
        }
    }       