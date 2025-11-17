/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q6;

/**
 *
 * @author tehjiajie
 * Write a program that used to create Pascal Triangle in the square matrix. The program 
will accept an integer from the users and use the integer to create the Pascal Triangle. 
 */
import java.util.*;
public class L5Q6 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row = sc.nextInt();
        int[][] pascal = new int[row][row];
        pascal[0][0]= 1;
        for(int i=0; i<row;i++){
            pascal[i][0]= 1;
        }
        
        
        for(int i=1; i<row; i++){
            for(int j=1; j<row; j++){
                if(j<=i)
                    pascal[i][j]= pascal[i-1][j-1] + pascal[i-1][j];  

            }
        }
        
        System.out.println("The Pascal Triangle with "+row+" row(s)");
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                System.out.printf("%3d ",pascal[i][j]);
            }
        System.out.println("");
        }
            
    }
    
}
