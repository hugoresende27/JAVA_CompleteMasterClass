/*
Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
it does not count towards the sum.
loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
 */

public class loneSum {

    public static int loneSum(int a, int b, int c) {
        int total=0;
        if (a!=b && a!=c) {
            total += a;
        }
        if (b!=a && b!=c) {
            total += b;
        }
        if (c!=a && c!=b) {
            total += c;
        }

        return total;

    }


    public static void main(String[] args) {
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
    }
}
