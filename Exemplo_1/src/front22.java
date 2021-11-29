/*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */

public class front22 {
    public static String front22(String str) {
        if (str.length()>=2){
            String x = str.substring(0,2);
            return x+str+x;
        }
        if (str.length()==1) return str+str+str;
        return "";
    }

    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
        System.out.println(front22("a") );
        System.out.println(front22("") );
    }
}
