/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */

class Pares{
    public String altPairs(String str) {
        String nova= "";
        for(int i=0; i< str.length(); i+=4){      //loop de paço 4, até final da str
            int fim = i+2;                        //var fim = i+2 // 0,2 --> 4,6 --> 8,10
            if (fim>str.length()){          //se fim maior que comprimento da string
                fim = str.length();         //fim vai ser igual ao valor do comprimento
            }
            nova += str.substring(i,fim);   //nova recebe (0,2) (4,6) se fim passar o lenght, vai de i até valor de length
        }
        return  nova;
    }

}

public class altPairs {
    public static void main(String[] args) {
        Pares x = new Pares();
        System.out.println(x.altPairs("kitten"));
        System.out.println(x.altPairs("Chocolate") );
        System.out.println(x.altPairs("CodingHorror"));
    }
}
