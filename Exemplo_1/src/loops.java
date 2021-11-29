import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int s = 0;
        for (int i=0; i<10; i++){
            System.out.println("Dez vezes! 10 X" + i +" <--");
            s++;
            System.out.println(s);
        }
        /////////////////////////////////////////////////////////////////////////////
        System.out.print("Quantas vezes?--> ");
        Scanner le = new Scanner(System.in);
        int ciclo = le.nextInt();
        int contador=0;
        while (contador < ciclo){
            System.out.println("While " + contador);
            contador++;
        }
        /////////////////////////////////////////////////////////////////////////////
        contador=0;
        boolean b=true;
        while (b) {
            contador++;
            System.out.println(contador);
            if (contador>=ciclo)
            {
                b = false;
            }
        }
        /////////////////////////////////////////////////////////////////////////////
        contador=0;
        do {
            System.out.println("Do while ola --> " + contador);
            contador++;
        }while (contador < ciclo);
    }
}
