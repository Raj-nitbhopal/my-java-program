
package stringpractice;
//import java.lang.String;

/**
 *
 * @author RAJAN
 */
public class StringPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "Java Program";
         
        char c[] = {'A','B','C','D','E'};
        byte b[] = {65,66,67,68,69};
        String str2 = new String(c);
        String str3 = new String(b);
        String str4 = new String("Java Program is Easy");
        System.out.println(str1.toUpperCase());
        System.out.println(str2);
        System.out.println(str3.toLowerCase());
        System.out.println(str4.toUpperCase());
        
    }
    
}
