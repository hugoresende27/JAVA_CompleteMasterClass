/*
Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive --
 then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n)
 {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code
 3 times (i.e. "decomposition").
Define the helper below and at the same indent level as the main noTeenSum().
noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3
 */

public class noTeenSum {

    public  static int noTeenSum(int a, int b, int c) {
        //if (a>=13 && a<=19 && a!=15 && a!=16) a=0;
        //if (b>=13 && b<=19 && b!=15 && b!=16) b=0;
        //if (c>=13 && c<=19 && c!=15 && c!=16) c=0;
        //return a+b+c;
        return fixTeen(a) + fixTeen(b) +fixTeen(c) ;
    }

    public static int fixTeen(int n){
        if (13<=n && n<=19 && n!=15 && n!=16)
            return 0;
        return n;
    }
    public static void main(String[] args) {
        Teen nova = new Teen();
        System.out.println(noTeenSum(1,2,3));
        System.out.println(noTeenSum(2, 13, 1));
        System.out.println(noTeenSum(2, 1, 14) );
        System.out.println(noTeenSum(2, 1, 16));//19
    }


}
