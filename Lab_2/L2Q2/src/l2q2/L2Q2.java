/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

import java.util.*;
public class L2Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the price of the car: ");
        double P = input.nextDouble();
        System.out.print("Enter the down payment: ");
        double D = input.nextDouble();
        System.out.print("Enter the interest rate in %: ");
        double R = input.nextDouble();
        System.out.print("Enter the loan duration in year: ");
        double Y = input.nextDouble();
        
        double M = (P-D)*(1 + (R*Y)/100)/(Y *12);
        
        System.out.printf("The monthly payment is RM%.2f",M);
    }
    
}
