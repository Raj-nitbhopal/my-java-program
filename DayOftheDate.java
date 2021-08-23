
package dayofthedate;
import java.util.*;

// Program to find Day ot the date of year betwwen 2000 and 3000 
public class DayOftheDate {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int day, month, year,result;
        int dcode, mcode, ycode;
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Date in DD/MM/YYYY Format:");
         day = sc.nextInt();
         month = sc.nextInt();
         year = sc.nextInt();
         if(month == 2 || month == 3 || month == 11){
             mcode = 4;
         }
         else if(month == 1 || month == 10){
             mcode = 1;
         }
         else if(month == 4 || month == 7){
             mcode = 0;
         }
         else if(month == 9 || month == 12){
             mcode = 6;
         }
         else if(month == 6){
             mcode = 5;
         }
         else{
             mcode = 3;
         }
         year = year-2000;
         ycode = year/4;
         if(year<=4)
             ycode = 0;
         result = day + mcode + year + ycode + 0;
         dcode = result %7;
         switch(dcode){
             case 0: System.out.println("SATURDAY");
                        break;
             case 1: System.out.println("SUNDAY");
                        break;
             case 2: System.out.println("MONDAY");
                        break;
             case 3: System.out.println("TUESDAY");
                        break;
             case 4: System.out.println("WEDNESDAY");
                        break;
             case 5: System.out.println("THURSDAY");
                        break;
             case 6: System.out.println("FRIDAY");
                        break;
         }
         
    }
    
}
