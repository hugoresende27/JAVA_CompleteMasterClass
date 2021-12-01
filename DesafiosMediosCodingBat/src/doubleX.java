/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */

public class doubleX {
    static boolean  doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    static boolean  doubleX2(String str) {
        int i= str.indexOf("x");
        if (i == -1) return false; //se não existirem 'x'

        if (i+1 >= str.length()) return false;//verifica se i+1 existe, dentro dos limites
        return str.substring(i+1, i+2).equals("x");

    }

    static boolean  doubleX3(String str) {
        int i = str.indexOf("x");
        String x = str.substring(i);
        return x.startsWith("xx");
    }

    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax") );
        System.out.println(doubleX("xxxxx"));
        System.out.println(doubleX("xaxxx") );
        System.out.println("#################################");

        System.out.println(doubleX2("axxbb"));
        System.out.println(doubleX2("axaxax") );
        System.out.println(doubleX2("xxxxx"));
        System.out.println(doubleX2("xaxxx") );
        System.out.println("#################################");

        System.out.println(doubleX3("axxbb"));
        System.out.println(doubleX3("axaxax") );
        System.out.println(doubleX3("xxxxx"));
        System.out.println(doubleX3("xaxxx") );

    }
}
