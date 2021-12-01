/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */

public class countXX {

    static int  countX(String str) {
        int cont=0;
        char t='x';
        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i)==t) {
                cont++;
            };
        }
        return cont;
    }

    static int  countXX(String str) {
        int cont=0;
        for (int i=0; i<str.length()-1; i++)
        {
            if (str.substring(i, i+2).equals("xx"))  {
                cont++;
            };
        }
        return cont;
    }

    public static void main(String[] args) {
        System.out.println(countX("abcxx"));
        System.out.println(countX("xxx") );
        System.out.println(countX("xxxx"));

        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx") );
        System.out.println(countXX("xxxx"));
    }

}
