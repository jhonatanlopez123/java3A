/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;

import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Bonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner le=new Scanner(System.in);
        int num=0,es=30;
        String[] l={"","A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        System.out.println("::::::::ALPHABET RANGOLI::::::::");
        System.out.println("----------------------------------");
        System.out.print("Type a number (1-27): ");
        num=le.nextInt();
        int num1=num-1;
        int num2=1;
        int num22=3;
        int num11=num+1;
        for(int f=num;f>=1;f--){
           System.out.println(" ");
           for(int e=1;e<=es;e++){
                System.out.print(" ");
            }
           for(int e=num1;e>=0;e--){
                System.out.print(" ");
                System.out.print("-");
            }
           for(int i=num;i>num1;i--){
              System.out.print(l[i]+"-");
           }
           for(int i=num11;i<=num;i++){
              System.out.print(l[i]+"-");
           }
           for(int e=num1;e>=1;e--){
                System.out.print(" ");
                System.out.print("-");
            }
        num11--;
        num1--;
        }
        for(int f1=num;f1>=2;f1--){
           System.out.println(" ");
           for(int e=1;e<=es;e++){
                System.out.print(" ");
            }
           for(int e=2;e<=num22;e++){
                System.out.print(" ");
                System.out.print("-");
            }
            for(int j=num;j>num2;j--){
               System.out.print(l[j]+"-");
            }
            for(int j=num22;j<=num;j++){
              System.out.print(l[j]+"-");
           }
            for(int e=3;e<=num22;e++){
                System.out.print(" ");
                System.out.print("-");
            }
        num22++;  
        num2++;
        }
        
    }
}

