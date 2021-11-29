/*
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */

public class front3 {

    public static String front3(String str) {
        //String nova = str.substring(0,3);
        //return nova+nova+nova;
        if (str.length()>=3) return str.substring(0,3) + str.substring(0,3) + str.substring(0,3) ;
        if (str.length() >= 2) return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        if (str.length() == 1) return str + str + str;
        return str;
    }
    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
        System.out.println(front3("ab"));
        System.out.println(front3("a"));
        System.out.println(front3(""));
    }
}
