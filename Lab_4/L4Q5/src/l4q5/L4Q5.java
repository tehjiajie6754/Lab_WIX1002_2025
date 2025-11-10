/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q5;

/**
 *
 * @author tehjiajie
 */
import java.util.*;
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int sum1=0;
        int sum2=0;
        int point1, point2 =0;
        int i=1;
        while(sum1<=100&&sum2<=100){
            System.out.println("\nRound "+i);
            point1 = rand.nextInt(6)+1;
            sum1 += point1;
            point2 = rand.nextInt(6)+1;
            sum2 += point2;
            System.out.println("\nPlayer 1: "+point1);
            while(point1 == 6) {
                System.out.println("Player 1: "+point1);
                point1 = rand.nextInt(6)+1;
                sum1 += point1;
            }
            System.out.println("Sum for player 1: "+sum1);
            System.out.println("\nPlayer 2: "+point2);
            while(point2 == 6) {
                System.out.println("Player 2: "+point2);
                point2 = rand.nextInt(6)+1;
                sum2 += point2;
            }
            System.out.println("Sum for player 2: "+sum2);
            i++;
        }
        if(sum1>sum2)
            System.out.println("\nPlayer 1 win.");
        else
            System.out.println("\nPlayer 2 win.");
        
        
    }
    
}
