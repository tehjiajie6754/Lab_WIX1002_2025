/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q1;

/**
 *
 * @author tehjiajie
 */
import java.util.*;
public class L4Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();
        
        System.out.print("The factors are: ");
        for(int i = 1;i<=num; i++){
        if(num%i==0){
            System.out.print(i);
            if(i < num){
                System.out.print(", ");
        }
        }}
        
    }
    
}
