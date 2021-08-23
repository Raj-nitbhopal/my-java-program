
package printingexample;
//import java.util.*;

/**
 *
 * @author RAJAN
 */
public class PrintingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 10, x=20;
        float f =1544523.4567f;
        char c = 'A';
        String str = "Java Programming";
      System.out.println(i+x);
      System.out.println("Sum of " + i + " and " + x + "is " + (i+x));
      System.out.printf("%d %d %.3f \n",i,x,f);
      System.out.printf("%7.2f\n",f);
      System.out.printf("%1$d %2$s %3$f\n",i ,str,f);
      System.out.printf("%3$s %2$d %1$d %4$.3f\n",i,x,str,f);
      System.out.printf("%30s\n",str);
      System.out.printf("%-30s\n",str);
      System.out.printf("%%d \\n \\t \n");
    }
    
}
