/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
but the "a" can be any char. The "yak" strings will not overlap.
stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */
public class stringYak {
    public static String stringYak(String str) {
        String front="" ;
        for (int i=0; i< str.length()-1; i++){
            front = str.replace("yak","");
        }
        return  (front);
    }

    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak") );
        System.out.println(stringYak("yak123ya"));
    }
}
