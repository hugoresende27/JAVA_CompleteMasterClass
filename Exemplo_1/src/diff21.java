import java.util.Scanner;
/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */
public class diff21 {
    public static int diff21(int n) {
        if (n>21){
            return Math.abs(2*(21-n));
        }
        return 21-n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Num -> ");
        int x = input.nextInt();
        System.out.println(diff21(x));
    }
}
