/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q8;

/**
 *
 * @author tehjiajie
 * 8. Write a program that generates the first n prime number. n is an random integer within 0 to 100. 
 */
import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101);
        System.out.println("First " + n + " prime numbers:");

        int i = 0;  
        int num = 2;    

        while (i < n) {
            boolean prime = true;

            // check if num is prime
            for (int k = 2; k <= Math.sqrt(num); k++) {
                if (num % k == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
                i++;
            }
            num++; 
        }
    }
}

