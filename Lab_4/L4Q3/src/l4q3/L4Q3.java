/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q3;

/**
 *
 * @author tehjiajie
 */
import java.util.*;
public class L4Q3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a score [negative score to quit]: ");
        int score = sc.nextInt();
        int i = 1;
        double max = score, min= score;
        double sumsquare = score*score, sum = score;
        
        while(score>=0){
            System.out.print("Enter a score [negative score to quit]: ");
            score = sc.nextInt();
            if(score >=0){
            sum += score;
            i++;
            sumsquare += score*score;
            if(score>max)
                max=score;
            else if(score<min)
                min=score;
            }
        }
        double s = Math.sqrt((sumsquare-Math.pow(sum,2)/i)/(i-1));
        double average = sum/i;
        System.out.println("");
        System.out.println("Minimum score: "+(int)min);
        System.out.println("Maximum score: "+(int)max);
        System.out.printf("Average score: %.2f%n",average);
        System.out.printf("Standard Deviation: %.2f%n",s);
    }
    
}
