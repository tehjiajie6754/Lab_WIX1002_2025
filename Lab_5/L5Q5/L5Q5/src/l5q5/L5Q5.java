/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q5;

/**
 *
 * @author tehjiajie
 * Write a program that generates 20 random integers within the range from 0 to 100. 
Sort the array in descending order. Then, accepts an integer input from the user. Then, 
search the array using this number. Compare the performance of linear search and 
binary search.  
 */
import java.util.*;
public class L5Q5 {

    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] num = new int[20];
        
        for(int i=0; i<20; i++){
            num[i] = rand.nextInt(101);
        }
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i=0; i<20; i++){
            System.out.print(num[i]);
            if(i<19)
                System.out.print(", ");
        }
            
        
        Arrays.sort(num);
        int[] num_des = new int[20];
        System.out.println("");
        System.out.println("Array in descending order");
        for(int i=19; i>=0; i--){
            System.out.print(num[i]);
            num_des[19-i]= num[i];
            if(i>0)
                System.out.print(", ");
        }
        
        System.out.print("\nEnter a number to search: ");
        int target = sc.nextInt();
        
        int s1 = 1;
        while(true){
            if(num_des[s1-1]==target){
                System.out.println("Linear Search - "+(s1)+" loop(s)");
                break;
            }
            s1++;
            if(s1==21){
                System.out.println("Not found.");
                break;
            }
        }
        
        
        // Binary Search (descending order)
        int low = 0;
        int high = 19;
        int s2 = 1;    // loop count tracker

        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (num_des[mid] == target) {
                System.out.println("Binary Search - " + s2 + " loop(s)");
                found = true;
                break;
            }
            // For descending order:
            else if (target < num_des[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            s2++;
        }

        if (!found)
            System.out.println("Binary Search - Not found.");


    }
    
}
