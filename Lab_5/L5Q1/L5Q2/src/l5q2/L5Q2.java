/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q2;

/**
 *
 * @author tehjiajie
 * 2. Write a program that generates 10 non-duplicate random integers within the range 
from 0 to 20. 
* Can use set(not save duplicate number)
 */
import java.util.*;
public class L5Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] integer = new int[10];
        boolean duplicate;
        for(int i=0; i<10; i++){
            integer[i] = rand.nextInt(21);
            for(int j=0; j<i; j++){
                duplicate = integer[i]==integer[j];
                while(duplicate){
                    integer[i] = rand.nextInt(21);
                    duplicate = integer[i] == integer[j];
                }
            }
            System.out.println(integer[i]);
            }
    }
    
}
