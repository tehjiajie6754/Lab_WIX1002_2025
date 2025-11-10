/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q2;

/**
 *
 * @author tehjiajie
 */
import java.util.*;
import java.util.Random;

public class L3Q2 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int num = rand.nextInt(6);
        String num_eng = null;
        
        if (num == 0)
            num_eng = "zero";
        else if (num == 1)
            num_eng = "one";
        else if (num == 2)
            num_eng = "two";
        else if (num == 3)
            num_eng = "three";
        else if (num == 4)
            num_eng = "four";
        else if (num == 5)
            num_eng = "five";
        
        System.out.println(num + " is " + num_eng + ".");
        
        
    }
    
}
