/*
Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas
efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% (0,15) de
comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final
do mês.
 */
import java.util.Scanner;
public class comissaoVendedor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;        //declaracao var nome
        float salario=0,vendas=0,salFinal=0,comissao=0;   //declaracao vars float
        System.out.print("Qual o seu nome? --> ");
        nome = input.nextLine();
        System.out.print("Qual o seu salário? --> ");
        salario = input.nextFloat();
        System.out.print("Total de vendas ? --> ");
        vendas = input.nextFloat();
        comissao = vendas*0.15f;//cálculo da comissão
        salFinal = salario + comissao;//cálculo salário final
        System.out.printf("O vendedor %s vai receber \n%.2f Euros de salário\n%.2f Euros de Comissão\n%.2f Euros de Salário final",nome,salario,comissao,salFinal);//output final
    }
}
