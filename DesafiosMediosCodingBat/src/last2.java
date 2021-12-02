/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the
last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
last2("xxaxxaxxaxx") → 3
 */
public class last2 {
    public static int last2(String str) {
        int cont=0;
        int tam = str.length();
        if (tam >=2){
            String fim = str.substring(tam-2,tam);
            String nov = "";
            for (int i=0; i< str.length()-2; i++){
                nov = str.substring(i,i+2);
                if (nov.equals(fim)){
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        System.out.println(last2("hixxhi") );
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
        System.out.println(last2("h") );
    }

}
