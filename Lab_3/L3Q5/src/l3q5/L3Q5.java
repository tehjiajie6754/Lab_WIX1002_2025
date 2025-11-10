/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q5;

/**
 *
 * @author tehjiajie
 */
import java.util.*;
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value od a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        
        double x, y = 0;
        if(a*d - b*c == 0)
            System.out.println("The equation has no solution.");
        else{
            x = (e*d - e*f)/(a*d - b*c);
            y = (a*f - e*c)/(a*d - b*c);
            System.out.println("x is "+x +"\ny is "+y);
        }
          
    }
    
}
