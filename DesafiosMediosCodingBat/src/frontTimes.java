/*

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class frontTimes {
    public static String frontTimes(String str, int n) {
        String res ="";
        if (str.length() >=3){
            String nova = str.substring(0,3);
            for (int i=0; i < n ; i++){
                res+=nova;
            }
        }
        else if (str.length() >= 2){
            String nova = str.substring(0,2);
            for (int i=0; i < n ; i++){
                res+=nova;
            }
        }
        else if (str.length() >= 1){
            String nova = str.substring(0,1);
            for (int i=0; i < n ; i++){
                res+=nova;
            }
        }
        return res;
    }
    public static String frontTimes2(String str, int n){
        int frontLen = 3;
        if (frontLen > str.length()) {//se a string tiver menos do que 3 char's
            frontLen = str.length();//o frontLen vai ser o cumprimento da string
        }
        String front = str.substring(0,frontLen);//uma string front de 0 ate ao frontLen
        String res = "";//res para retornar e adicionar com o for n vezes a string front
        for (int i=0; i<n; i++) {
            res += front;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
        System.out.println(frontTimes("Ab", 4)) ;

        System.out.println(frontTimes2("Chocolate", 2));
        System.out.println(frontTimes2("Chocolate", 3));
        System.out.println(frontTimes2("Abc", 3));
        System.out.println(frontTimes2("Ab", 4)) ;
    }
}
