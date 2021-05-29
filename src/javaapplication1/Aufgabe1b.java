/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ysfzy
 */
public class Aufgabe1b {
  
   public static void main(String[] Args){
       
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       if(x == -1){
           System.out.println("Falsche Eingabe");
       }else{
        System.out.println(faktoriell(x));
       }  
   }
   
   public static int faktoriell(int a){
       
       int i = 1;
       if(a < 0){
            return -1; 
       }
       while(a>0){ 
           i = i*a;
           a--;   
       }
        return i;
}
  
}
