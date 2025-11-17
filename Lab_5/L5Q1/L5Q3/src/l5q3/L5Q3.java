/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q3;

/**
 *
 * @author tehjiajie
 * Write a program that randomly generate the seven day work hours (1-8 hours) for N 
employee. Then, display the work hours in seven days and the total hours for each 
employee.
 */
import java.util.*;
public class L5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the number of employee(s): ");
        int n = sc.nextInt();
        int[][] w_hour = new int[n][7];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<7; j++){
                w_hour[i][j] = rand.nextInt(8)+1;
            }
        }
        
        int sum;
        for(int i=0; i<n; i++){
            System.out.println("For employee "+(i+1)+ ": ");
            sum =0;
            for(int j=0; j<7; j++){
                System.out.println("Day "+(j+1)+" : "+w_hour[i][j]);
                sum += w_hour[i][j];
            }
            System.out.println("The total hours for this employee: "+sum+"\n");
        }
    }
    
}
