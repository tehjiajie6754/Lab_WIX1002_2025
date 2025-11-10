/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

/**
 *
 * @author tehjiajie
 */
import java.util.Random;
public class L3Q4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int p1_d1 = rand.nextInt(6)+1;
        int p1_d2 = rand.nextInt(6)+1;
        int p2_d1 = rand.nextInt(6)+1;
        int p2_d2 = rand.nextInt(6)+1;
        int result_p1 = p1_d1 + p1_d2;
        int result_p2 = p2_d1 + p2_d2;
        
        System.out.println("For player 1: \nDice 1: "+p1_d1+"\nDice 2: "+ p1_d2 +"\nResult is "+result_p1);
        System.out.println("For player 2: \nDice 1: "+p2_d1+"\nDice 2: "+ p2_d2 +"\nResult is "+result_p2);
        
        if(result_p1 == result_p2)
            System.out.println("They got same result.");
        else if(result_p1 > result_p2)
            System.out.println("Player 1 win with result: "+result_p1);
        else 
            System.out.println("Player 2 win with result: "+result_p2);
    }
    
}
