/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should
 not be removed.
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */

public class stringX {
    public static String stringX(String str) {
        String nova="";
        if (str.length()>=2){
            if (str.charAt(0) == 'x' ){
                nova+='x';
            }
            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i) == 'x'){
                    nova += "";
                } else {
                    nova +=str.substring(i,i+1);
                }
            }
            if (str.charAt(str.length()-1)=='x') {
                nova += 'x';
            }
        }
        if (str.length() == 1){
            nova +=str.charAt(0);
        }
        return nova;

    }

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }


}
