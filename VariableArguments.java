// 1. Find maximum in variable Arguments
// 2. Sum of all numbers using variable arguments
// 3. Calculate Discount on x>=1000 d=15%, 500 >= x <1000 d=10%, x<500 d=5%
package variablearguments;
public class VariableArguments {

   static int max(int ...x){
     int temp = x[0];
       try{       
       if(x.length == 0) return Integer.MIN_VALUE;
       else{          
               for(int i:x){
               if(temp < x[i])
                   temp = x[i];
                }
           }               
        } 
        catch(ArrayIndexOutOfBoundsException e){           
            } 
        return temp;
    }
   static int sum(int ...x){
       int s=0;
       for(int i=0;i<x.length;i++){
           s = s + x[i];
       }
       return s;
   }
   static double sum(double ...x){
       double s=0;
       for(int i=0;i<x.length;i++){
           s = s + x[i];
       }
       return s;
   }
   static double discount(double ...x){
       double pay_amount, discount;
       double total = sum(x);
       if(total>=1000){
           discount = total*15/100;
       }else if(total>1000 && total<=500) 
       {
           discount = total*10/100;
       }
       else{
           discount = total*5/100;
       }
       pay_amount = total-discount;
       return pay_amount;
   }
   public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println("Maximum Number is " + max(arr));
        System.out.println("Sum of Number: " + sum(arr));
        System.out.println("Total payable Amount = " + discount(112.0, 20.9, 99.00,299.45));
    }
}       