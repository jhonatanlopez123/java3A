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
/*}if(v[1]>=20 || v[2]>=20 || v[3]>=20 || v[4]>=20){
                           if(v[1]>v[2] || v[1]>v[3] || v[1]>v[4]){
                            System.out.println("el ganador fue: "+1);
                            b=1;
                           }else if(v[2]>v[1] || v[2]>v[3] || v[2]>v[4]){
                            System.out.println("el ganador fue: "+2);
                            b=1;                            
                           }else if(v[3]>v[1] || v[3]>v[2] || v[3]>v[4]){
                            System.out.println("el ganador fue: "+3);
                            b=1;
                           }else if(v[4]>v[1] || v[4]>v[2] || v[4]>v[3]){
                            System.out.println("el ganador fue: "+4);
                            b=1;
                           }*/
                         //b=1;