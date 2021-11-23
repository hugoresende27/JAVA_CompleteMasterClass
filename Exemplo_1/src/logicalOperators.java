import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        System.out.println("Escreva a idade:: ");
        int anos = idade.nextInt();
        if (anos >= 18 && anos <50) { //anos maior ou igual a 18 e menor do que 50, verdadeiro verdadeiro
            System.out.println("É adulto");
        } else if (anos < 18 ){
            System.out.println("Não é adulto");
        }
        ///////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira Nota Exame 1::");
        int first = sc.nextInt();
        System.out.print("Insira Nota Exame 2::");
        int second = sc.nextInt();
        if (first > 50 || second > 50){ //se alguma das notas for > 50, ACEITE, ou first ou second ||, basta uma verdadeira para a condição se verdadeira
            System.out.println("ACEITE");
        }


    }
}
