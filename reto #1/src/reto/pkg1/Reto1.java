/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.pkg1;
import java.util.Scanner;
import java.util.Random;
/**
 * @author jhonatan
 */
public class Reto1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a=0,b=0,c=0,n=0,d=0,cero=0,NumParPo=0,NumParNeg=0,NumImpNeg=0,NumImpPo=0,SumPo=0;
         while(d==0){
         Scanner l = new Scanner(System.in);
         System.out.println("numero de valores aleatorios a generar: ");
         a = l.nextInt();
         System.out.println("rango inferior: ");
         b = l.nextInt();
         System.out.println("rango superior: ");
         c = l.nextInt();
         if(b<c){
           System.out.println("los numeros son: ");
           for(int i = 1; i<=a; i++){
             //System.out.println((int)(Math.random()*(c-b+1)+b));
             n=((int)(Math.random()*(c-b+1)+b));
             System.out.println("el numero: "+n);
             if(n==0){
              cero++;
             }else if(n%2==0){
                if(n>0){
                   NumParPo++;
                  }else{
                   NumParNeg++;
                   SumPo=SumPo+n;
                  }
             }else{
                if(n>0){
                   NumImpPo++;
                  }else{
                   NumImpNeg++;
             }   
             }
           }
            System.out.println("la cantidad de ceros son: "+cero);
            System.out.println("los nueros positivos pares son: "+NumParPo);
            System.out.println("los nueros negativos pares son: "+NumParNeg);
            System.out.println("los nueros positivos impares son: "+NumImpPo);
            System.out.println("los nueros negativos impares son: "+NumImpNeg);
            System.out.println("suma de los nueros negativos pares son: "+SumPo);
            d=1;
         }else{
            System.out.println("-----------------------");
            System.out.println("error");
            System.out.println("-----------------------");
            d=0;
         }
         }
        }
    }
