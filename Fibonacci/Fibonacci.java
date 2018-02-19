//******************************************************************************************
// Author: Rawson Tsao      Section: 02
//
// Fibonacci.java   
// Represents the first n integers of the Fibonacci series and prints them
// then prints the nth number selected by the user
//*****************************************************************************************

import java.util.Scanner;

public class Fibonacci{
   public static void main(String[] args){
      int limit = 20;
      
      long[] series = new long[limit];
      Scanner scan = new Scanner(System.in);
      
      series[0] = 0;
      series[1] = 1; 
      
      for(int i = 2; i < 20; ++i){
         series[i] = series[i - 2] + series[i - 1];
      }
      
      System.out.print("Enter which term you would like to see 1 to 20: "); 
      int n = scan.nextInt(); 
      
      if(n > 0 && n < 21){
         System.out.println("The " + n + "th Fibonacci number is " + series[n - 1]);
      }
      
      else {
         System.out.println("Please pick a number beteen 1 to 20"); 
      }
   }
}