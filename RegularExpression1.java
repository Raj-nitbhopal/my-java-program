
package regularexpression1;


public class RegularExpression1 {

    
    public static void main(String[] args) {
     String str1 = "tbjdscnc3244324243c";
     System.out.println(str1.matches(".*"));
     String str2 = "bbcacbcabacbacabcabca";
     System.out.println(str2.matches("[abc]*"));
     String str3 = "hdfghg";
     System.out.println(str3.matches("[a-z]*"));
     String str4 = "ababababababbabbabaaa";
     System.out.println(str4.matches("[abc]*"));
     String str5 = "abbaccacccaaaaacac";
     System.out.println(str5.matches("[abc]{3,5}"));
     String str6 = "XZ";
     System.out.println(str6.matches("XZ"));
     String str7 = "abcbcaccaca";
     System.out.println(str7.matches("[abc]{11}"));
     String str8 = "adfdffdfdgdghjfbdhgdfgfgv";
     System.out.println(str8.matches("[a-z]*"));
     String str9 = "rajankmr117@gmail.com";
     System.out.println(str9.matches(".*@gmail.*"));
     System.out.println(str9.matches("\\w*@gmail.*"));

        
    }
    
}
