/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglearea;
import java.util.*;
import java.lang.*;

/**
 *
 * @author RAJAN
 */
public class TriangleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float length, Height,Area,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and Height: ");
        length  = sc.nextFloat();
        Height = sc.nextFloat();
        Area = .5f*length*Height;
        System.out.println("Area of Triangle = " + Area);
        
        int a,b,c;
       
        System.out.println("Enter Side of Triangle");
        a = sc.nextInt();
        b= sc.nextInt();
        c = sc.nextInt();
       s = (a+b+c)/2f;
       Area = s*(s-a)*(s-b)*(s-c);
       System.out.println("Area of Triangle = " + Math.sqrt(Area));
  
        
    }
    
}
