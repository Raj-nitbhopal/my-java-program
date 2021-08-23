
package methodoverloading;
import java.util.Arrays;

public class MethodOverloading {

   
    static double Area(int rad){
        return Math.PI*Math.pow(rad, 2);
    } 
    static double Area(int x, int y){
        return x*y;
    }
    static int Reverse(int x){
        int sum=0,i,rem;
        while(x!=0){
            rem = x%10;
            sum = sum*10 + rem;
            x = x/10;
          
        }
      return sum;  
    }
    static void Reverse(int ...x){
        int[] y = new int[x.length];
        try{
            for(int i= x.length-1,j=0;i>=0;i--,j++){
                y[j] = x[i];
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
        
        }
        System.out.print("Array in Reverse: " + Arrays.toString(y));       
    }
    static boolean Validate(String Name){
        return Name.matches("[a-zA-Z\\s]+");
        
    }
    static boolean Validate(int age){
        return age>=3 && age<=15 ;
    }
    public static void main(String[] args) {
        // TODO code application logic here
 
        System.out.printf("Area of Circle = %.2f\n", Area(14,7));
        System.out.println("Area of Rectangle = " + Area(4,6));
        System.out.println("Reverse of 12345 is : "+ Reverse(12345));
        Reverse(2,3,4,5,6,7,8,9);
        System.out.println("\nName is Valid: " + Validate("Rajan"));
        System.out.println("Valid age for children to Go School: " + Validate(80));
    }    
}
