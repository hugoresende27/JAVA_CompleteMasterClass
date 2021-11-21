public class Casting {

    //widening type cast não perde dados
    // -->BYTE -->SHORT -->INT -->LONG -->FLOAT -->DOUBLE
    //narrowing type cast pode perder dados
    public static void main(String[] args) {
        double d= 4.5;
        int a = (int) 4.6;
        System.out.println(a);
/////////////////////////////////////////////////////////////////////////////////
        int b= 6;
        double c= b;
        System.out.println(c);// = 6.0
        //int g = c; --> java: incompatible types: possible lossy conversion from double to int
        //System.out.println(g);
        int g = (int)c;         //Explicit casting
        System.out.println(g);
///////////////////////////////////////////////////////////////////////////////////
        int Icast = 7;
        double Icast2 = Icast;  //Implicit casting
        System.out.println(Icast2);
///////////////////////////////////////////////////////////////////////////////////
        double z = 7L; //wrapper classes
        System.out.println(z);

    }
}
