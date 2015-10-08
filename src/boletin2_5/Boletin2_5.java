
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {
    static final int  VALOR = 1582 ;
   
    public static void main(String[] args) {
    //entrada por teclado
     int millaMarina;
     Scanner obx = new Scanner (System.in);
     System.out.println("teclea milla :");
     millaMarina = obx.nextInt();
     System.out.println("Distancia ="+ millaMarina * VALOR +"m");
    }
    
}
