/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

import java.util.*;
public class L2Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int second = input.nextInt();
        int hour = second/3600;
        int minutes = (second - hour*3600)/60;
        int second_rem = second - (hour*3600) - (minutes * 60);
        System.out.println(second +" seconds is " + hour + " hours, "+minutes + " minutes and "+second_rem+" seconds.");
    }
    
}
