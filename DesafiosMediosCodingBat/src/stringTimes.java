/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public class stringTimes {
    public static String stringTimes(String str, int n) {
      //  if (n>=0){
       //     return str.repeat(n);
      //  }
       // return str;
        String res = "";
        for (int i=0; i<n; i++) {
            res += str;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
    }
}
