/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q6;

/**
 *
 * @author tehjiajie
 */
import java.util.*;
public class L4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int num = rand.nextInt(999999999);
        int i = 0;
        System.out.println(num);
        while(num!=0){
            num /= 10;
            i++;
        }
        System.out.println("The number of digit is: "+i);
    }
    
}
