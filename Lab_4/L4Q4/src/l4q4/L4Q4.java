/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q4;

/**
 *
 * @author tehjiajie
 */
import java.util.*;
public class L4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday,..., 6 for Saturday): ");
        int f_day = sc.nextInt();
        int day_b_May = 0;
        int day_b_Aug = 0;
        
        
        if((year%4==0&&year%100!=0)||year%400==0){
            day_b_May = 121;
            day_b_Aug = 121+92;
        }
        else{
            day_b_May = 120;
            day_b_Aug = 120+92;
        }
        
        int f_day_May = (day_b_May+f_day)%7;
        int f_day_Aug = (day_b_Aug+f_day)%7;
        
        
        System.out.println("\nMay");
        System.out.println("  Sunday  Monday  Tuesday  Wednesday Thursday  Friday  Saturday");
        System.out.print("        ".repeat(f_day_May+1));
        for(int i=1;i<=31;i++){
            if(f_day_May>=7){
                f_day_May = f_day_May%7;
                System.out.print("\n    ");
            }
            if(i>=10){
                System.out.print(i+"       ");}
            else
                System.out.print(i+"        ");
            f_day_May ++;
            
            }
        System.out.println("\n\nAugust");
        System.out.println("  Sunday  Monday  Tuesday  Wednesday Thursday  Friday  Saturday");
        System.out.print("        ".repeat(f_day_Aug+1));
        System.out.print(" "); 
        for(int i=1;i<=31;i++){
            if(f_day_Aug>=7){
                f_day_Aug = f_day_Aug%7;
                System.out.print("\n    ");
            }
            if(i>=10){
                System.out.print(i+"       ");}
            else
                System.out.print(i+"        ");
            f_day_Aug ++;
            
            }
            
        }
    }
    

