/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //ejercicio #1
     /*   int n=0,i=0;
        int w[] = {1,2,3,4,5};
        System.out.println("escriba 4 numeros: ");      
        while(i!=4){
            i++;
            Scanner l = new Scanner(System.in);
            w[i] = l.nextInt();
        }
        if (w[1]>w[2] && w[1]>w[3] && w[1]>w[4]){
           System.out.println("el numero mas alto es: "+w[1]);
        }else if (w[2]>w[1] && w[2]>w[3] && w[2]>w[4]){
           System.out.println("el numero mas alto es: "+w[2]);
        }else if (w[3]>w[1] && w[3]>w[2] && w[3]>w[4]){
           System.out.println("el numero mas alto es: "+w[3]);
        }else if (w[4]>w[1] && w[4]>w[2] && w[4]>w[3]){
           System.out.println("el numero mas alto es: "+w[4]);
        }
        }
    }*/
     //ejercicio #2
      /*  int b=0,dado1=0,dado2=0;
        while(b==0){
            b=0;
            Scanner s = new Scanner(System.in);
            System.out.println("presione enter para tirar los dados: ");
            s.nextLine();
            dado1 =((int)(Math.random()*(6-1+1)+1));
            dado2 =((int)(Math.random()*(6-1+1)+1));
            
            System.out.println("dado1: "+dado1+" dado2: "+dado2);
            if (dado1==1 && dado2==1){
             System.out.println("--------------------------");
             System.out.println("fin del programa");
            b=1;  
            }
        }*/
  //ejercicio #3
 /*   int i=0,x=0,n=0;
    for(i=1;i<=10;i++){
      System.out.println("tabla del "+i);
      for(x=1;x<=10;x++){
        n=i*x;
        System.out.println(i+" * "+x+" = "+n);
      }
    }
     */
  //ejercicio #4
   /*Scanner s = new Scanner(System.in);
    int max=0,n=0,m=0,c=0;
    System.out.println("escriba lacantidad de números: ");
    max = s.nextInt();
    for(c = 0;c < max;c++ ){
        System.out.println("escriba un número: ");
        n = s.nextInt();
        if(c==0){
           m=n;
        }else if(n>m){
           m=n;
        }
    }
    System.out.println("El numero mayor es "+m);*/
  }
}