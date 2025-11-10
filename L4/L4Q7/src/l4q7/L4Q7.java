/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q7;

/**
 *
 * @author tehjiajie
 */
import java.util.*;
public class L4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter interest rate in %: ");
        double i = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double N = sc.nextInt();
        
        double M = (P*(i/(12*100)))/(1-(Math.pow((1+(i/(12*100))),-N)));
        double C=0,L=0, R=0, T=0;
        
        System.out.println(   "Month       Monthly Payment     Principal       Interest        Unpaid Balance      Total Interest");
        for(int j=1;j<=(int)N;j++){
            C = M*Math.pow(1+(i/(12*100)),-(1+N-j));
            L= M-C;
            T +=L;
            R =L/(i/(12*100))-C;
            System.out.printf("%2d %24.2f %13.2f %14.2f %21.2f %19.2f%n",(int)j,M,C,L,R,T);
        }
    }
}
