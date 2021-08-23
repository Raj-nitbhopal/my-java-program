
package stringmethod;
public class StringMethod {
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Java Program is robust";
        int len = str.length();
        System.out.println("Length of Line "+len);
        String str1 = str.toLowerCase();
        System.out.println("String in Lower case: "+str1);
        System.out.println("String in Upper case: "+str.toUpperCase()); 
        System.out.println("Replacing a to k: " + str.replace('a', 'k'));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,9));
        System.out.println(str.substring(3,10));
        String nstr = "      Java Program          ";
        char str2 = str.charAt(13);
        System.out.println(nstr.trim());
        System.out.println(str.charAt(2));
        
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("is",10));
        System.out.println(str.startsWith("Java",6));
        System.out.println(str.endsWith("st"));
        System.out.println(str2);
        System.out.println(str.equals("Java Program is robust"));
        System.out.println(str.equalsIgnoreCase("java Program is robust"));
        System.out.println(String.valueOf(-100));
        System.out.println(str=="Java Program is robust");
        System.out.println(str.substring(-22,0));
    }
    
}
