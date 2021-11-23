import java.util.Scanner;

public class bankAppV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************************");
        System.out.println("** Welcome Bank app V1  **");
        System.out.println("** As nossas operações  **");
        System.out.println("** 1. SAIR         *******");
        System.out.println("** 2. TRANSFERIR     *****");
        System.out.println("** 3. LEVANTAR      ******");
        System.out.println("**************************");
        System.out.print("OPCAO--> ");

        int op = sc.nextInt();
        if (op == 1) {
            System.out.println("A sair do sistema");
        } else if (op == 2) {
            System.out.print("Quanto dinheiro tem disponivel?--> ");
            int disp = sc.nextInt();
            System.out.print("Quanto quer transfererir?--> ");
            int tran = sc.nextInt();
            if (disp >= tran){
                disp -= tran;
                System.out.println("Transferindo dinheiro "+tran+" euros");
            } else {
                System.out.println( "Operação Impossivel");
            }
            System.out.println("Saldo Disponivel:: "+disp+" euros");

        } else if (op == 3) {
            System.out.println("Retire o seu dinheiro");
        } else {
            System.out.println("Operação Inválida");
        }
    }
}
