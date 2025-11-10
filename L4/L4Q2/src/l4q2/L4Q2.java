/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q2;

/**
 *Write a program that accepts an integer n from user and then sum the following series. 
* 1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)
 * @author tehjiajie
 */
import java.util.*;
public class L4Q2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        int sum = 0;
        int pre = 0;
        for(int i=1; i<=n; i++){
            pre += i;                //1      1+2      1+2+3
            sum = sum + pre;         //0+1    1+(1+2)  1+(1+2)+(1+2+3)
        }
        System.out.println(sum);
    }
    
}
