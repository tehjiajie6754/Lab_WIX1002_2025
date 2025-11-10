/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

/**
 *
 * @author tehjiajie
 */
import java.util.*;
public class L3Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n ;i++){
        System.out.print("Enter "+(i+1)+" integer number: ");
        num[i] = sc.nextInt();
        }
        System.out.print("Enter the operand: ");
        char oper = sc.next().charAt(0);
        int result=num[0];
        
        if(oper=='+'||oper=='-'||oper=='/'||oper=='*'){
        for(int i=1; i<n;i++){
        if (oper == '+')
            result += num[i];
        else if (oper == '-')
            result -= num[i];
        else if (oper == '/')
            result /= num[i];
        else if (oper == '*')
            result *= num[i];
        }
        }
        else
            System.out.println("Error. Undefined operation.");
        
        System.out.println(" ");
        for(int i=0;i<n;i++){
        System.out.print(num[i]+" ");
        if(i<n-1)
            System.out.print(oper+" ");
        }
        System.out.print(" = "+result+"\n");
        
    }
    
}
