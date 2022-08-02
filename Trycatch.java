package com.company;
import java.util.Scanner;
class trycatch
{
   public  static void trycatchex()
   {
       int n;
       float avg;
       int sum;
       Scanner in = new Scanner(System.in);
       n = in.nextInt();
       sum =in.nextInt();
       try {
          avg = sum/n;
       }
       catch(ArithmeticException e)
       {
           System.out.println("Please enter the valid number");
       }
   }
}
public class Main {

    public static void main(String[] args) {
	trycatch n = new trycatch();
    n.trycatchex();
    }
}
