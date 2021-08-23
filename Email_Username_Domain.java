
package email_username_domain;
import java.util.Scanner;


public class Email_Username_Domain {

   
    public static void main(String[] args) {
       //String email = "rajankmr117@gmail.com";
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your Email Address:");
       String email = sc.nextLine();
        int index = email.indexOf('@');
        String username = email.substring(0,index);
        String domain = email.substring(index+1);
        
        System.out.println("User Name: " + username);
        System.out.println("Domain: " + domain);
        if(domain.startsWith("gmail"))
            System.out.println("Your Email id is of Gmail Domain");
        else
            System.out.println("Your Email id is Not of Gmail Domain");
        
    }
    
}
