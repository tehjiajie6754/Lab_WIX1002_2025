/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q1;

/**
 *
 * @author tehjiajie
 * 1. Write a program to randomly generate N student scores (0-100). The program will 
prompt the user to enter N students and store the score in an array. Then, the program 
will display a list of score, the highest score, the lowest score and the average score. 
 */
import java.util.*;
public class L5Q1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int N = sc.nextInt();
        int[] score = new int[N];
        double sum = 0;
        
        System.out.println("List of score: ");
        for(int i=0; i<N; i++){
            score[i] = rand.nextInt(101);
            sum += score[i];
            System.out.println("Student "+(i+1)+": "+score[i]);
        }
        
        Arrays.sort(score);
        System.out.printf("The average score is: %.2f%n", (sum/N));
        System.out.println("The highest score is: "+score[N-1]);
        System.out.println("The lowest score is: "+score[0]);
    }
    
}
