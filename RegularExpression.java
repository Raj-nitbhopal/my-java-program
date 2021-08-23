
package regularexpression;


public class RegularExpression {

    
    public static void main(String[] args) {
     String str1 = "t";
     System.out.println(str1.matches("."));
     String str2 = "b";
     System.out.println(str2.matches("[abc]"));
     String str3 = "h6";
     System.out.println(str3.matches("[a-z][0-9]"));
     String str4 = "a";
     System.out.println(str4.matches("a|b"));
     String str5 = "abc";
     System.out.println(str5.matches("abc"));
     String str6 = "XZ";
     System.out.println(str6.matches("XZ"));
     String str7 = "a";
     System.out.println(str7.matches("[^abc]"));
     String str8 = "av";
     System.out.println(str8.matches("[abc][vz]"));
     
    }
    
}
