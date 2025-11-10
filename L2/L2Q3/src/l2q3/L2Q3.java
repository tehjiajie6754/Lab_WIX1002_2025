/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

import java.util.Random;
public class L2Q3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(41) + 10;
        int num2 = rand.nextInt(41) + 10;
        int num3 = rand.nextInt(41) + 10;
        
        double sum = num1 + num2 + num3;
        double average = sum/3.0;
        
        System.out.println(num1 + ", "+num2+", "+num3);
        System.out.println("The sum is "+sum);
        System.out.printf("The average is %.2f",average);
    }
    
}
