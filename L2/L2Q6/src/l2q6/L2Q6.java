/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

import java.util.*;
public class L2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram: ");
        double gram = sc.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double temp_b = sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double temp_f = sc.nextDouble();
        
        gram = gram/1000;
        temp_b = (temp_b-32)/1.8;
        temp_f = (temp_f-32)/1.8;
        
        double Q = gram * (temp_f - temp_b) * 4184;
        
        System.out.printf("The energy needed is %e%n",Q);
        
        
        
    }
    
}
