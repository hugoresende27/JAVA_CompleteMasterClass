import java.util.Scanner;

public class ClassesAula {
    public static void main(String[] args) {
        //No netBeans (ctrl + shift + i) importa auto as libraries
        //String
        //Math
        //Scanner
        int var2 = 8;
        Scanner var1 = new Scanner(System.in);//System.in para input do utilizador
        System.out.print("Insira um número (a)--> ");
        int a = var1.nextInt();//variável a vai ter o input var1 tipo inteiro
        System.out.print("Insira um número (b)--> ");
        int b = var1.nextInt();
        System.out.println("Inseriu o número "+ a + " e o número " + b + " somados " + (a+b));
///////////////////////////////////////////////////////////////////////////////////////////////
        Scanner input = new Scanner(System.in);
        System.out.println("Valor A--> ");
        int x = input.nextInt();
        System.out.println("Valor B--> ");
        int y = input.nextInt();
        System.out.println("Inseriu o número "+ x + " e o número " + y + " dividos " + (a/b));
    }
}
