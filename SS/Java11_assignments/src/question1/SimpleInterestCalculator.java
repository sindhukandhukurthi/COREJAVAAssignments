package question1;

import java.util.*;
import java.util.Scanner;
     public class SimpleInterestCalculator {
            

			public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
      System.out.print("Enter principal amount(p): ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual interest rate (r): ");
   var rate = sc.nextDouble();
        System.out.print("Enter time (t): ");
       var time = sc.nextDouble();
       InterestCalculator i = (p, r, t) -> (p * r * t) / 100;

      
        double simpleInterest = i.calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();
   
    }
}