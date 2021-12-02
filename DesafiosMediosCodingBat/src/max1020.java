/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is
in that range.
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */
public class max1020 {
    public static int max1020(int a, int b) {   //15,30             //19,11
        int temp =0;//var temporária
        if (b>a){//se o b maior do que o a          30>15
            temp = a;//temp recebe o a              t = 15
            a = b;//a passa a valer b               15(a) = 30(b)
            b = temp;// b passa a valer temp        30(b) = 15(a)
        }
        if (a>=10 && a <= 20) return a;             //a=30          //a=19 return
        if (b>=10 && b <= 20) return b;             //b=15 return   //b=11
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9) );
        System.out.println(max1020(10, 21));

    }
}
