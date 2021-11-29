import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Java é muito importante!");
        Scanner x = new Scanner(System.in);
        System.out.print("NUM 1-->");
        int num1 = x.nextInt();
        System.out.print("NUM 2-->");
        int num2 = x.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\n\tnum1 = "+num1+"\n\tnum2 = " + num2 +"\n\ttemp = "+ temp);
    }
}
