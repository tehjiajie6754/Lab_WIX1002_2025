/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

/**
 *
 * @author tehjiajie
 */
import java.util.*;

public class L3Q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        double sales = sc.nextDouble();
        double commission=0;
        
        if(sales <= 100)
            commission = 5;
        else if(sales <= 500)
            commission = 7.5;
        else if(sales <= 1000)
            commission = 10;
        else 
            commission = 12.5;
        
        System.out.printf("Your commission is %.2f%%%n",commission);
        
            
                
    }
    
}
