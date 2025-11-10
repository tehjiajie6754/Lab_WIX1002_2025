/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

import java.util.*;


public class L2Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the temperature in degree Fahrenheit : "); 
        double temp_f = input.nextDouble(); 
        
        double temp_c = (temp_f - 32)/1.8; 
        
        System.out.printf("%n It is equal to %.2f degree Celsius", temp_c);
    }
}
