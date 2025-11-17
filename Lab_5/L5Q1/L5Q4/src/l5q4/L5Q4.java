/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q4;

/**
 *
 * @author tehjiajie
 * Write a program that rotates 90 degrees clockwise a 3 by 3 matrix.
 */
import java.util.*;
public class L5Q4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("3 x 3 Matrix");
        int[][] matrix = new int[3][3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[j][i]= sc.nextInt();
            }
        }
        
        System.out.println("After rotate 90 degree clockwise");
        for(int i=0; i<3; i++){
            for(int j=2; j>=0; j--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
