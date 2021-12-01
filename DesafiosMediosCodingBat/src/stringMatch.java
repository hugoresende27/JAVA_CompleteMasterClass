/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */

public class stringMatch {
    public static int stringMatch(String a, String b) {
        int cont=0;
        int len = Math.min(a.length(), b.length());//descobrir qual a string mais curta, atribuir a var len
        //System.out.println(len);
        for (int i=0; i<len-1; i++)//for ate len-1
        {
            if (a.substring(i, i+2).equals(b.substring(i,i+2)))  {
                cont++;
            };
        }
        return cont;
    }

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz") );
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc") );
    }

}
