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
        int a=0,d=1,op=0,max=0,i=1,dado1=0,dado2,b=0,k=0;
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
                       int w[] = {1,2,3,4,5};
                       int v[] = {0,0,0,0,0};
                       int x[] = {0,0,0,0,0};
                       max=20;
                       System.out.println("a escogido el nivel basico");
                       while(b==0){
                       for(i=1;i<=a;i++){
                         System.out.println("------------------------"); 
                         System.out.println("turno del jugador: "+i);
                         System.out.println("presione enter para tirar los dados: ");
                         s.nextLine();
                         dado1 =((int)(Math.random()*(6-1+1)+1));
                         dado2 =((int)(Math.random()*(6-1+1)+1));
                         w[i] = dado1 + dado2;
                         /*if(v[i]>14){
                          w[i]=dado1;                                                   //este if sirve cuando al jugador le
                          System.out.println("te toca jugar solo con el dado1");        //falta muy poco para llegar a la meta
                          System.out.println("");
                         }*/
                         if (dado1==dado2){
                         x[i] = x[i]+1;
                         } 
                         v[i] = v[i]+w[i];
                         
                         /*if(v[i]>20){        //este if hace que el jugador no gane hasta que tenga
                          v[i] = v[i]-w[i];    // un puntaje de 20 exatos ni mas ni menos.
                         }*/
                        
                         System.out.println("dado1: "+dado1+" dado2: "+dado2+" suma de ambos: "+w[i]);
                         System.out.println(" jugador n.1: "+v[1]+" || jugador n.2: "+v[2]+" || jugador n.3: "+v[3]+" || jugador n.4: "+v[4]);
                         if(v[i]>=max || x[i]==3){
                          System.out.println("el ganadoe es el jugador: "+i);
                          i=6;
                          b=1;
                         }else if (v[1]<max || v[2]<max || v[3]<max || v[4]<max){
                         b=0;  
                         }
                         
                         }
                         
                        if(i==a){
                          i=0;
                         }
                        }
                        

                        d=0;
                        break;
                    case 2 :
                       int w2[] = {1,2,3,4,5};
                       int v2[] = {0,0,0,0,0};
                       int x2[] = {0,0,0,0,0};
                       max=30;
                       System.out.println("a escogido el nivel intermedio");
                       while(b==0){
                       for(i=1;i<=a;i++){
                         System.out.println("------------------------"); 
                         System.out.println("turno del jugador: "+i);
                         System.out.println("presione enter para tirar los dados: ");
                         s.nextLine();
                         dado1 =((int)(Math.random()*(6-1+1)+1));
                         dado2 =((int)(Math.random()*(6-1+1)+1));
                         w2[i] = dado1 + dado2;
                         /*if(v2[i]>24){
                          w2[i]=dado1;                                                  //este if sirve cuando al jugador le
                          System.out.println("te toca jugar solo con el dado1");         //falta muy poco para llegar a la meta
                          System.out.println("");
                         }*/
                         if (dado1==dado2){
                         x2[i] = x2[i]+1;
                         } 
                         v2[i] = v2[i]+w2[i];
                         /*if(v2[i]>20){        //este if hace que el jugador no gane hasta que tenga
                          v2[i] = v2[i]-w2[i];    // un puntaje de 20 exatos ni mas ni menos.
                         }*/
                         System.out.println("dado1: "+dado1+" dado2: "+dado2+" suma de ambos: "+w2[i]);
                         System.out.println(" jugador n.1: "+v2[1]+" || jugador n.2: "+v2[2]+" || jugador n.3: "+v2[3]+" || jugador n.4: "+v2[4]);
                         if(v2[i]>=max || x2[i]==3){
                          System.out.println("el ganadoe es el jugador: "+i);
                          i=6;
                          b=1;
                         }else if (v2[1]<max || v2[2]<max || v2[3]<max || v2[4]<max){
                         b=0;  
                         }
                         }
                         
                        if(i==a){
                          i=0;
                         }
                        }
                        

                        d=0;
                        break;
                    case 3 :
                       int w3[] = {1,2,3,4,5};
                       int v3[] = {0,0,0,0,0};
                       int x3[] = {0,0,0,0,0};
                       max=50;
                       System.out.println("a escogido el nivel avanzado");
                       while(b==0){
                       for(i=1;i<=a;i++){
                         System.out.println("------------------------"); 
                         System.out.println("turno del jugador: "+i);
                         System.out.println("presione enter para tirar los dados: ");
                         s.nextLine();
                         dado1 =((int)(Math.random()*(6-1+1)+1));
                         dado2 =((int)(Math.random()*(6-1+1)+1));
                         w3[i] = dado1 + dado2;
                         /*if(v3[i]>44){
                          w3[i]=dado1;                                            //este if sirve cuando al jugador le 
                          System.out.println("te toca jugar solo con el dado1");    //falta muy poco para llegar a la meta
                          System.out.println("");
                         }*/
                         if (dado1==dado2){
                         x3[i] = x3[i]+1;
                         } 
                         v3[i] = v3[i]+w3[i];
                         /*if(v3[i]>20){        //este if hace que el jugador no gane hasta que tenga
                          v3[i] = v3[i]-w3[i];    // un puntaje de 20 exatos ni mas ni menos.
                         }*/
                         
                         System.out.println("dado1: "+dado1+" dado2: "+dado2+" suma de ambos: "+w3[i]);
                         System.out.println(" jugador n.1: "+v3[1]+" || jugador n.2: "+v3[2]+" || jugador n.3: "+v3[3]+" || jugador n.4: "+v3[4]);
                         if(v3[i]>=max || x3[i]==3){
                          System.out.println("el ganadoe es el jugador: "+i);
                          i=6;
                          b=1;
                         }else if (v3[1]<max || v3[2]<max || v3[3]<max || v3[4]<max){
                         b=0;  
                         }
                         }
                         
                        if(i==a){
                          i=0;
                         }
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
              d = 1;
 
            }
               
    }
    
}
}