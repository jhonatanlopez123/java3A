/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author Estudiantes
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i=0,c=0;
       for(i=1;i<=30;i++){      
       if(i%2 == 0){
         c++;
         System.out.println(i);
         }
       }
       System.out.println("numeros pares totales: "+c);
    } 
}