/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

import java.util.Random;
public class L2Q5 {

    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10001);
        int sum=0;
        
        System.out.println("The random number is "+num);
        
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("The sum of all digit is "+ sum);
        
    }
    
}
