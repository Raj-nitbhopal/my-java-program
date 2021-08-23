//Problem Statement:
//Enter a string and length of substring and find minimum and maximum substring 
package hcsmallest_greatest_string;
import java.util.Scanner; 


public class HcSmallest_greatest_String {

        public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int start, end;
        System.out.println("Enter subtring length you want:");
        int len = sc.nextInt();
        int str_length = str.length();
        end   = str_length-(len-1);
        String[] substrArr = new String[end];
        System.out.print("String of Length" +len + " are: ");
        for(int i=0;i<str_length;i++){
            start = i;
             if(i<end){                          
                substrArr[i] = str.substring(start,len+i);               
             System.out.print(substrArr[i]+", ");              
             }           
        }
        System.out.print("\nSorted order of String of length "+len+ " are: ");
       min_max_Str(substrArr,end-1);
    }
    public static void min_max_Str(String[] temp, int size){
        String temp_str;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<=size;j++){
                if(temp[j].compareTo(temp[i])<0)
                {
                    temp_str = temp[i];
                    temp[i] = temp[j];
                    temp[j] = temp_str;
                }  
            }                      
        }
        for(int k=0;k<=size;k++){
            System.out.print(temp[k]+ ", ");
        }       
        System.out.println("\nMinimum String: " + temp[0]);
        System.out.println("Maximum String: " + temp[size]);
    }    
}



