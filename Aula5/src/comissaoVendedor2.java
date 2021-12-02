import java.util.Scanner;

class SalarioFinal {        //nova classe de nome SalarioFinal
    public float comissao (float s,float v){        //metodo de return tipo float, recebe 2 paramentros, s e v
        return s+(v*0.15f);     //return do calculo do salario + (vendas * 0.15%)
        }
}
public class comissaoVendedor2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SalarioFinal resultado = new SalarioFinal();
        //instanciar um novo objeto de nome resultado, com base na classe SalarioFinal()

        String nome;        //declaracao var nome
        float salario=0,vendas=0,salFinal=0,comissao=0;   //declaracao vars float
        System.out.print("Qual o seu nome? --> ");
        nome = input.nextLine();
        System.out.print("Qual o seu salário? --> ");
        salario = input.nextFloat();
        System.out.print("Total de vendas ? --> ");
        vendas = input.nextFloat();
        System.out.printf("%s vai receber %.2f Euros", nome,resultado.comissao (salario,vendas));
        //vou chamar o objeto resultado . metodo/função comissão com os parametros (salario,vendas)
    }
}
