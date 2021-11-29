/*
Given a string, return a new string where the first and last chars have been exchanged.
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */

public class frontBack {

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String nova = str.substring(1,str.length()-1);//string nova vai do index 1 até ao penultimo
        return str.charAt(str.length()-1) + nova + str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ba"));
    }
}
