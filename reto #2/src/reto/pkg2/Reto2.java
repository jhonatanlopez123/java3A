/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.pkg2;
import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Reto2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0,d=1,op=0,max=0,i=0,dado1=0,dado2,sum=0;
        while(d==1){   
            Scanner l = new Scanner(System.in);
            Scanner s = new Scanner(System.in);
            System.out.println("cantidad de jugardores: ");
            a = l.nextInt();
            if(a>=2 && a<=4){
               System.out.println("nivel del juego");
               System.out.println("(1.) nivel basico");
               System.out.println("(2.) nivel intermedio");
               System.out.println("(3.) nivel avanzado");
               System.out.println("escoja una opcion 1,2 o 3");
               op = l.nextInt();
               switch(op){
                   case 1 :
                       int v[] = {1,2,3,4};
                       int vector[] = {1,2,3,4};
                       System.out.println("a escogido el nivel basico");
                       max=10;
                       while(vector [i] <= max ){
                         
                         for(i=1;i<=a;i++){
                         System.out.println("------------------------"); 
                         System.out.println("turno del jugador: "+i);
                         System.out.println("presione enter para tirar los dados: ");
                         s.nextLine();
                         dado1 =((int)(Math.random()*(6-1+1)+1));
                         dado2 =((int)(Math.random()*(6-1+1)+1));
                         vector[i] = dado1 + dado2;
                         v[i] = v[i] + vector[i];
                         //sum = vector[i];
                         //vector[i] = vector[i] + ñ;
                         System.out.println("dado1: "+dado1+" dado2: "+dado2+ " suma: "+vector[i]);
                         System.out.println("TOTAL JUGADOR 1:"+v[i]);
                         }
                         
                         //System.out.println("TOTAL JUGADOR 1:"+vector[i]);
                         //System.out.println("TOTAL JUGADOR 2:"+vector[i]);
                         
                       }
                       
                       //System.out.println("TOTAL JUGADOR 3:"+vector[3]);
                       d=0;
                       break;
                   case 2 :
                       System.out.println("a escogido el nivel intermedio");
                       max=30;
                       for(i=1;i<=a;i++){
                         System.out.println("------------------------"); 
                         System.out.println("turno del jugador: "+i);
                         System.out.println("presione enter para tirar los dados: ");
                         s.nextLine();
                         dado1 =((int)(Math.random()*(6-1+1)+1));
                         dado2 =((int)(Math.random()*(6-1+1)+1));
                         sum = dado1 + dado2;
                         System.out.println("dado1: "+dado1+" dado2: "+dado2+" suma de ambos: "+sum);
                       }
                       d=0;
                       break;                       
                   case 3 :
                       System.out.println("a escogido el nivel avanzado");
                       max=50;
                       for(i=1;i<=a;i++){
                         System.out.println("------------------------"); 
                         System.out.println("turno del jugador: "+i);
                         System.out.println("presione enter para tirar los dados: ");
                         s.nextLine();
                         dado1 =((int)(Math.random()*(6-1+1)+1));
                         dado2 =((int)(Math.random()*(6-1+1)+1));
                         sum = dado1 + dado2;
                         System.out.println("dado1: "+dado1+" dado2: "+dado2+" suma de ambos: "+sum);
                       }
                       d=0;
                       break;                      
                   default :
                       System.out.println("error");
                       System.out.println("--------------------");
                       d=1;
                       break;
               }
            }else{
               System.out.println("no puede jugar");
               System.out.println("--------------------");
            d=1;
           }
        }
    }
    
}
