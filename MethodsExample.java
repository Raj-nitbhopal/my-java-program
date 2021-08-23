//Problem1: Check number is prime or not 
//Problem2: Find GCD of two numbers
package methodsexample;
import java.util.Scanner;
public class MethodsExample {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a Number to checkPrime");
      int number = input.nextInt();
      isPrime(number);
      System.out.println("Enter first Number to find GCD:");
      int number1 = input.nextInt();
      System.out.println("Enter Second Number to find GCD:");
      int number2 = input.nextInt();
      System.out.println("GCD of Two Number by Method1 "+ number1 + " And " + number2 +" is "+ (gcd1(number1,number2)));
      System.out.println("GCD of Two Number by Method2 "+ number1 + " And " + number2 +" is "+ (gcd2(number1,number2)));

    }
    // Method to check Prime number
    static void isPrime(int x)
    {
        int flag = 0,i;
        for(i=2;i<x;i++){
            if(x % i==0)
                flag = 1;
        }
        System.out.println("Number is Prime " + (flag==0?"TRUE":"FALSE"));
    }
    // First Method to GCD of two numbers
    static int gcd1(int x, int y)
    {   
        int r=1,i;
        for(i=1;i<=min(x,y);i++){
            if(x%i==0 & y%i==0)
                  r = r*i;
            //System.out.println(i);
        }
      return r;      
    }
     static int min(int n, int m){
        if(n<m)
            return n;
        else
            return m;
        }
     //Second method to find GCD of two number
    static int gcd2(int j, int k)
    {
        while(j!=k){
            if(j>k)j = j-k;
            else k = k-j;
        }
      return j;      
    }
}
