/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;
import java.util.*;
/**
 *
 * @author tehjiajie
 * Write a program that asks users to enter the radius of a circle and a coordinate point 
(x, y). Determine whether the point is inside or outside the circle centered at (0, 0). 
 */
public class L3Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double radius = sc.nextDouble();
        System.out.print("enter a coordinate point (x y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        double distance = Math.sqrt(x*x+y*y);
        
        if(distance < radius)
            System.out.printf("The coordinate point (%d, %d) is inside the circle.%n",x,y);
        else if(distance > radius)
            System.out.printf("The coordinate point (%d, %d) is outside the circle.%n",x,y);
        else
            System.out.printf("The coordinate point (%d, %d) is lies on the circle.%n",x,y);
    }
    
}
