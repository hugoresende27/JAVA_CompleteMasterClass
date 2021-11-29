import java.util.Scanner;
//escreva um programa q receba 2 numeros e no final faça as 4 operações, + - * /
/* String.format para formatar as casas decimais */
public class aula4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o valor A ?--> ");
        float x = input.nextFloat();
        System.out.print("Qual o valor B ?--> ");
        float y = input.nextFloat();
        System.out.println("OPCAO 1 -- SOMA ");
        System.out.println("OPCAO 2 -- SUBTRAÇÃO ");
        System.out.println("OPCAO 3 -- MULTIPLICAÇÃO ");
        System.out.println("OPCAO 4 -- DIVISÃO ");
        System.out.print("Escolha--> ");
        int op = input.nextInt();
        switch (op) {
            case 1:
                System.out.println("Soma = "+ (x+y));
                break;
            case 2:
                System.out.println("Subtracao = "+ (x-y));
                break;
            case 3:
                System.out.println("Multiplicacao = "+ (x*y));
                break;
            case 4:
                System.out.println("Divisao String.format= "+ String.format("%.2f",(x/y)));
                System.out.printf("Divisao printf = %.2f", (x/y));
                break;
        }

    }
}
