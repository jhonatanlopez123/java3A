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
        //ejercicio #1
    /* int i=0,c=0;
       for(i=1;i<=30;i++){ //i++ <==> i = 1 + i     
       if(i%2 == 0){
         c++;
         System.out.println(i);
         }
       }
       System.out.println("numeros pares totales: "+c);
       */
       //ejercicio #2
       /*int i=0,cp=0,ci=0,ap=0,ai=0;
       for(i=1;i<=5;i++){ //i++ <==> i = 1 + i  
       System.out.println(i);
       if(i%2 == 0){
         cp=cp+1;//cp++
         ap=ap+i;
        }else{
         ci=ci+1;
         ai=ai+i;
         }
       }
       System.out.println("el resultado de la suma de pares es: "+ap);
       System.out.println("el resultado de la suma de impares es: "+ai);
       System.out.println("numeros pares totales: "+cp);
       System.out.println("numero impares totales: "+ci);
       */
       //ejercicio #3
       int i=1,cp=0,ci=0,ap=0,ai=0;
       while(i <= 5){
        System.out.println(i);
        if(i%2 == 0){
         cp=cp+1;//cp++
         ap=ap+i;
        }else{
         ci=ci+1;
         ai=ai+i;
         }
        i++;
       }
       System.out.println("el resultado de la suma de pares es: "+ap);
       System.out.println("el resultado de la suma de impares es: "+ai);
       System.out.println("numeros pares totales: "+cp);
       System.out.println("numero impares totales: "+ci);
    } 
}