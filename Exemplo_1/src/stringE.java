/*
Return true if the given string contains between 1 and 3 'e' chars.
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class stringE {
    public static boolean stringE(String str) {
        int cont=0;
        char letra = 'e';
        for (int i = 0; i< str.length(); i++)
        {
            if (str.charAt(i)==letra)
            cont++;
        }
        if (cont >=1 && cont <=3) return true;
        return  false;
    }

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }

}
