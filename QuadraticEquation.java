/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;
import java.util.*;

/**
 *
 * @author RAJAN
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        double d,r1,r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Co-efficients of quadratic Equations:");
        a = sc.nextInt();
        b= sc.nextInt();
        c = sc.nextInt();
        d = b*b-4*a*c;
        if(d>0)
        {
            System.out.println("Roots are Real and Distinct:");
            r1 = (-b+Math.sqrt(d))/(2*a);
            r2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("D = "+d+", Roots are: " + r1 + ", " + r2);
        }
        else if(d==0)
        {
            System.out.println("D = "+d+", Roots are Real and Equal:");
            r1 = (-b+Math.sqrt(d))/(2*a);
            r2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are: " + r1 + ", " + r2);
        }
        else
        {
            System.out.println("Roots are Imaginary and D= " + d);
            
            
        }
        
    }
    
}
