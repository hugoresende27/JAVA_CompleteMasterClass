import org.w3c.dom.ls.LSOutput;

/*
Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
class TratamentoStrings{
    public String stringSplosion(String str) {
        String nova="";
      // if (str.length()>2){
            for (int i=0; i<str.length(); i++) {
                nova += str.substring(0,(i+1));
            }
            /*
        }else if (str.length()>1){
           for (int i=0; i<2; i++) {
               nova += str.substring(0,(i+1));
           }
       } else{
           nova+=str.charAt(0);
       }
       */

        return nova;
    }

}

public class stringSplosion {
    public static void main(String[] args) {
        TratamentoStrings var = new TratamentoStrings();
        System.out.println(var.stringSplosion("Code"));
        System.out.println(var.stringSplosion("abc"));
        System.out.println(var.stringSplosion("ab"));
    }

}
