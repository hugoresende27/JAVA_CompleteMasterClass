/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
*/
public class missingChar {
//DIVIDIR A STRING EM 2, de 0 ate n e de n+1 até ao fim, return das duas strings concatenadas
    public static String missingChar(String str, int n) {
        String frente = str.substring(0,n);
        String tras = str.substring(n+1,str.length());
        return frente + tras;
    }

    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }
}
